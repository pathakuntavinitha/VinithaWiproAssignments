package mainapp;

import org.hibernate.Session;
import mypojos.Account;
import mypojos.Transaction;
import util.AccountHibernateUtil;

import java.util.List;

public class AccountApp {
    public static void main(String[] args) {
        Session session = AccountHibernateUtil.getSessionFactory().openSession();
        org.hibernate.Transaction hibernateTx = session.beginTransaction(); 
        Account acc = new Account();
        acc.setAccountHolder("Vinitha");

        Transaction t1 = new Transaction();
        t1.setAmount(20000);
        t1.setAccount(acc);

        Transaction t2 = new Transaction();
        t2.setAmount(5000);
        t2.setAccount(acc);

        acc.addTransaction(t1);
        acc.addTransaction(t2);

        session.save(acc);

        hibernateTx.commit();
        session.close(); 

        Session newSession = AccountHibernateUtil.getSessionFactory().openSession();
        Account account = newSession.get(Account.class, acc.getAccountId());

        if (account != null) {
            List<Transaction> transactions = account.getTransactions();
            System.out.println("Account Holder: " + account.getAccountHolder());
            for (Transaction t : transactions) {
                System.out.println("Transaction ID: " + t.getTransactionId() + ", Amount: " + t.getAmount());
            }
        } else {
            System.out.println("Account not found.");
        }

        newSession.close();
    }
}
/*
 * Hibernate: insert into Account (accountHolder) values (?)
Hibernate: insert into Transaction (account_id, amount) values (?, ?)
Hibernate: insert into Transaction (account_id, amount) values (?, ?)
Hibernate: select account0_.accountId as accounti1_0_0_, account0_.accountHolder as accounth2_0_0_ from Account account0_ where account0_.accountId=?
Account Holder: Vinitha
Hibernate: select transactio0_.account_id as account_3_1_0_, transactio0_.transactionId as transact1_1_0_, transactio0_.transactionId as transact1_1_1_, transactio0_.account_id as account_3_1_1_, transactio0_.amount as amount2_1_1_ from Transaction transactio0_ where transactio0_.account_id=?
Transaction ID: 3, Amount: 20000.0
Transaction ID: 4, Amount: 5000.0


mysql> create database AccountTransaction;
Query OK, 1 row affected (0.01 sec)

mysql> use AccountTransaction;
Database changed
mysql> show tables;
+------------------------------+
| Tables_in_accounttransaction |
+------------------------------+
| account                      |
| transaction                  |
+------------------------------+
2 rows in set (0.01 sec)

mysql> select * from account;
+-----------+---------------+
| accountId | accountHolder |
+-----------+---------------+
|         1 | Vinitha       |
|         2 | Vinitha       |
+-----------+---------------+
2 rows in set (0.00 sec)

mysql> select * from transaction;
+---------------+--------+------------+
| transactionId | amount | account_id |
+---------------+--------+------------+
|             1 |   1000 |          1 |
|             2 |    500 |          1 |
|             3 |  20000 |          2 |
|             4 |   5000 |          2 |
+---------------+--------+------------+
4 rows in set (0.00 sec)

mysql>
*/
