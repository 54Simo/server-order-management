# server-order-management
订单管理-----服务器端程序


### ###############目录结构：

    ├─ order-management
    │  ├─ .settings
    │  │  ├─ .jsdtscope
    │  │  ├─ org.eclipse.jdt.core.prefs
    │  │  ├─ org.eclipse.wst.common.component
    │  │  ├─ org.eclipse.wst.common.project.facet.core.xml
    │  │  ├─ org.eclipse.wst.jsdt.ui.superType.container
    │  │  └─ org.eclipse.wst.jsdt.ui.superType.name
    │  ├─ WebContent
    │  │  ├─ META-INF
    │  │  │  └─ MANIFEST.MF
    │  │  └─ WEB-INF
    │  │     ├─ lib
    │  │     │  ├─ c3p0-0.9.5.2.jar
    │  │     │  ├─ c3p0-oracle-thin-extras-0.9.5.2.jar
    │  │     │  ├─ commons-beanutils-1.9.3.jar
    │  │     │  ├─ commons-collections-3.2.2.jar
    │  │     │  ├─ commons-dbutils-1.4.jar
    │  │     │  ├─ commons-lang-2.3.jar
    │  │     │  ├─ commons-logging-1.2.jar
    │  │     │  ├─ ezmorph-1.0.6.jar
    │  │     │  ├─ json-lib-2.4-jdk15.jar
    │  │     │  ├─ mchange-commons-java-0.2.11.jar
    │  │     │  └─ mysql-connector-java-5.1.44-bin.jar
    │  │     └─ web.xml
    │  ├─ src
    │  │  ├─ cn
    │  │  │  └─ simo
    │  │  │     ├─ dao
    │  │  │     │  ├─ OrderDao.java
    │  │  │     │  └─ UserDao.java
    │  │  │     ├─ domain
    │  │  │     │  ├─ Order.java
    │  │  │     │  └─ User.java
    │  │  │     ├─ service
    │  │  │     │  ├─ OrderService.java
    │  │  │     │  └─ UserService.java
    │  │  │     ├─ utils
    │  │  │     │  ├─ DataSourceUtils.java
    │  │  │     │  └─ Utils.java
    │  │  │     └─ web
    │  │  │        └─ servlet
    │  │  │           ├─ AddOrderServlet.java
    │  │  │           ├─ LoginServlet.java
    │  │  │           ├─ MsgServlet.java
    │  │  │           └─ RegisterServlet.java
    │  │  └─ c3p0-config.xml
    │  ├─ .classpath
    │  ├─ .gitignore
    │  └─ .project
    └─ README.md
### ####################API接口描述

1. 登录API（LoginServlet）
2. 注册API（RegisterServlet）
3. 添加订单API（AddOrderServlet）

### ####################更新日志

2017年11月28日 09:19
-----------------------------------
注册+登录+添加订单API
