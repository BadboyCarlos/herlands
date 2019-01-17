
import org.junit.jupiter.api.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Carlos Lv
 * @version: v1.0
 * @description: PACKAGE_NAME
 * @date:2019/1/17
 */
public class GeneratorCode {

    @Test
    public void test() throws Exception {
            List<String> warnings = new ArrayList<String>();
            boolean overwrite = true;
            File configFile = new File("mbg.xml");
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
    }
}
