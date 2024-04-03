

package org.example.school;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.fill.Column;

import java.sql.Types;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Jalon
 * @since 2023/8/1 11:35
 **/
public class CodeGenerator {

    // 数据库地址
    private static final String URL = "jdbc:mysql://localhost:3306/mpac?useUnicode=true&useSSL=false&characterEncoding=utf8&serverTimezone=Asia/Shanghai";

    // 数据库用户名
    private static final String USERNAME = "root";

    // 数据库密码
    private static final String PASSWORD = "Mpac_1987_#$";

    // 生成代码的包名
    private static final String PACKAGE = "org.example.school";

    // 作者
    private static final String AUTHOR = "lmw";

    // 过滤的数据库名前缀
    private static final String[] PREFIXS = {"sys_"};

    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");

        FastAutoGenerator.create(URL, USERNAME, PASSWORD)
                .globalConfig(builder -> {
                    builder.author(AUTHOR) // 设置作者
//                            .enableSwagger() // 开启 swagger 模式
                            .outputDir(projectPath + "/src/main/java") // 输出目录
                            .disableOpenDir(); //
                })
                .dataSourceConfig(builder -> builder.typeConvertHandler((globalConfig, typeRegistry, metaInfo) -> {
                    int typeCode = metaInfo.getJdbcType().TYPE_CODE;
                    if (typeCode == Types.SMALLINT) {
                        // 自定义类型转换
                        return DbColumnType.INTEGER;
                    }
                    return typeRegistry.getColumnType(metaInfo);

                }))
                .packageConfig(builder -> {
                    builder.parent(PACKAGE) // 设置父包名
//                            .moduleName("") // 设置父包模块名
                            .entity("domain.entity")
                            .pathInfo(Collections.singletonMap(OutputFile.xml, projectPath + "/src/main/resources/mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig((scanner, builder) -> {
                    List<String> tables = getTables(scanner.apply("请输入表名，多个英文逗号分隔，所有表生成输入 all"));
                    builder.addTablePrefix(PREFIXS) // 过滤前缀
                            .addInclude(tables) // 增加表匹配
                            // controller配置
                            .controllerBuilder()
                            .enableRestStyle() // 添加@RestController
                            .enableHyphenStyle() // 驼峰转连字符
                            // 实体类配置
                            .entityBuilder()
                            .enableFileOverride() // 生成覆盖
                            .enableLombok() //添加lombok
                            .addTableFills(new Column("create_time", FieldFill.INSERT))
                            .disableSerialVersionUID() // 禁用生成 serialVersionUID
                            .idType(IdType.ASSIGN_ID) // 当用户未输入时，采用雪花算法生成一个适用于分布式环境的全局唯一主键
                            .build();
                })
                // 引擎模板，默认的是Velocity引擎模板
//                .templateEngine(new BeetlTemplateEngine()) // Beetl引擎模板
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板
                .execute();
    }

    // 处理 all 情况
    protected static List<String> getTables(String tables) {
        return "all".equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(","));
    }
}

