package jdbcdaofiles;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PersonDAOImpl implements PersonDAO {
    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public void save(Person p) {
        jdbcTemplate.update("INSERT INTO person(id, age, firstName, lastName) VALUES (?, ?, ?, ?)",
                p.getId(), p.getAge(), p.getFirstName(), p.getLastName());
    }
    public void update(Person p) {
        jdbcTemplate.update("UPDATE person SET age=?, firstName=?, lastName=? WHERE id=?",
                p.getAge(), p.getFirstName(), p.getLastName(), p.getId());
    }
    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM person WHERE id=?", id);
    }
/*
    @SuppressWarnings("deprecation")
	public Person get(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM person WHERE id=?",
                new Object[]{id},
                new PersonRowMapper());
    }*/
    public Person get(int id) {
        String sql = "SELECT * FROM person WHERE id=?";
        try
        {
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new PersonRowMapper());
        }
        catch (EmptyResultDataAccessException e) 
        {
        	//System.out.println("Record Not Found!");
        	return null;
        }
    }
    public List<Person> list() {
        return jdbcTemplate.query("SELECT * FROM person", new PersonRowMapper());
    }

    private static class PersonRowMapper implements RowMapper<Person> {
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Person(rs.getInt("id"), rs.getInt("age"),
                    rs.getString("firstName"), rs.getString("lastName"));
        }
    }
		
	}

