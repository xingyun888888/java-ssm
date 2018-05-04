package com.gaochao.migrate;

import com.googlecode.flyway.core.Flyway;

import javax.persistence.ValidationMode;
import javax.sql.DataSource;

/**
 * Created by smileMAC on 18/5/4.
 */
public class FlywayMigration {
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void migrate() {
        Flyway flyway = new Flyway();
        flyway.setDataSource(dataSource);

        flyway.setSchemas("gaochao1"); // 设置接受flyway进行版本管理的多个数据库
//        flyway.setTable(""); // 设置存放flyway metadata数据的表名
        flyway.setLocations("db/migrations"); // 设置flyway扫描sql升级脚本、java升级脚本的目录路径或包路径
        flyway.setLocations("classpath:db/migration");
        flyway.setEncoding("UTF-8"); // 设置sql脚本文件的编码

        flyway.migrate();
    }

}
