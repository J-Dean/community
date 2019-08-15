## springboot 社区项目

## 资料
[Spring文档](https://spring.io/guides/)  
[Spring Web文档](https://spring.io/guides/gs/serving-web-content/)  
[es社区(参照模板)](https://elasticsearch.cn/)  
[GitHub deploy key](https://developer.github.com/v3/guides/managing-deploy-keys/#deploy-keys)  
[Bootstrap](https://v3.bootcss.com/getting-started/)
[Github OAuth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)  
[菜鸟教程](https://www.runoob.com/mysql/mysql-select-query.html)  
[thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#setting-attribute-values)
## 工具
[Git](https://git-scm.com/download)  
[Visual Paradigm](https://www.visual-paradigm.com)  
[flyway](https://flywaydb.org/getstarted/firststeps/maven)  
[lombok](https://projectlombok.org)

```bash
mvn flyway:migrate
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate   
```

**解决h2数据库默认用户密码问题**
执行以下代码
```sql
CREATE USER IF NOT EXISTS sa PASSWORD '123';
ALTER USER sa admin true ;
```