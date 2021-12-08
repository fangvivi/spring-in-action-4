package profile_test;

import cn.wayne.profile.DataSourceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

import java.util.List;

import static junit.framework.TestCase.*;

/**
 * 测试Profile功能
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DataSourceConfig.class})
@ActiveProfiles("dev")
public class DataSourceConfigTest {
    @Autowired
    private DataSource dataSource;

    @Test
    public void shouldBeEmbeddedDataSource(){
        assertNotNull(dataSource);
        JdbcTemplate jdbc = new JdbcTemplate(dataSource);
        List<String> results = jdbc.query("select id , name from Things", (rs, rowNum) -> rs.getString("name"));
        assertEquals("A", results.get(0));
    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes = DataSourceConfig.class)
    @ActiveProfiles("prod")
    public static class ProdDataSourceTest {

        @Autowired
        private DataSource dataSource;

        @Test
        public void shouldBeJndiDataSource() {
            // should be null, because there isn't a datasource configured in JNDI
            assertNull(dataSource);
        }
    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(locations = "classpath:datasource-config-test.xml")
    @ActiveProfiles("dev")
    public static class DevDataSourceTest_XMLConfig {

        @Autowired
        private DataSource dataSource;

        @Test
        public void shouldBeEmbeddedDataSource() {
            assertNotNull(dataSource);
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
            List<String> results = jdbcTemplate.query("select * from Things", (rs, rowNum) -> rs.getString("name"));
            assertEquals("A", results.get(0));
        }

    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(locations = "classpath:datasource-config-test.xml")
    @ActiveProfiles("prod")
    public static class ProductionDataSourceTest_XMLConfig {

        @Autowired(required = false)
        private DataSource dataSource;

        @Test
        public void shouldBeEmbeddedDataSource() {
            assertNull(dataSource);
        }

    }
}


