# java-study

[![Java](https://img.shields.io/badge/Java-17%2B-007396?logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.2-6DB33F?logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Kotlin](https://img.shields.io/badge/Kotlin-1.9.22-7F52FF?logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![Maven](https://img.shields.io/badge/Maven-3.9%2B-C71A36?logo=apachemaven&logoColor=white)](https://maven.apache.org/)

个人学习记录：用一组彼此独立的小例子练习 Java / Kotlin 基础，以及 Spring 里两种依赖注入写法（Java 配置、组件扫描、XML）。仓库没有统一的父工程，也不是一个可部署的业务应用。

各目录单独用 Maven 或 `javac` 运行。Spring 示例启动后只向控制台打印一行引擎启动信息，然后进程结束。

## 内容一览

| 目录 | 是什么 | 实际在练什么 |
| --- | --- | --- |
| [`javaBase`](javaBase) | 独立 Maven 工程 | 接口、抽象类、枚举、构造方法、`instanceof` |
| [`javaDemo`](javaDemo) | 聚合 POM + 散落源文件 | 接口注入、反射、注解定义；子模块覆盖异常、Swing、IO、线程、Socket、泛型 |
| [`javaDemo1`](javaDemo1) | 独立 Maven 工程 | 构造器注入，以及用反射读取自定义注解 |
| [`kotlinBase`](kotlinBase) | 独立 Maven 工程 | Kotlin 语法，以及和 Java 互相调用 |
| [`springdemo`](springdemo) | Spring Boot 3.2.2 | `@Configuration` + `@Bean` 显式装配 |
| [`springDemo1`](springDemo1) | Spring Boot 3.2.2 | `@ComponentScan` + `@Autowired` 构造器注入 |
| [`xmlDIDemo`](xmlDIDemo) | Spring Boot 3.2.2 | `ClassPathXmlApplicationContext` 读取 `basic-config.xml` |

三个 Spring 工程的领域模型都是同一套练习：`Car` 依赖 `Engine`，燃油引擎再依赖凸轮轴 `Camshaft` 和曲轴 `Crankshaft`。类名在源码里写成 `CombunstionEngine`（少了一个 `s`），下文命令与代码保持一致。

## 技术栈

| 项目 | 版本 / 说明 |
| --- | --- |
| JDK | Spring 模块在 `pom.xml` 中声明 Java 17。本仓库在 JDK 21 上完成下面的构建和运行 |
| Spring Boot | `3.2.2`（`spring-boot-starter`、`spring-boot-starter-test`）。没有引入 Web Starter |
| Kotlin | `1.9.22`，`kotlin-stdlib-jdk8`，`jvmTarget` 为 `1.8` |
| 测试 | 普通模块使用 JUnit `3.8.1`；Spring 模块使用 JUnit Jupiter（由 `spring-boot-starter-test` 带入） |
| 构建 | 普通模块直接使用本机 Maven。`springdemo`、`springDemo1`、`xmlDIDemo` 自带 Maven Wrapper（Maven `3.9.5`） |

普通模块的 POM 没有声明 `maven.compiler.release`。Maven 3.9 默认用 Java 8 字节码编译，可以正常通过。发行版自带的旧插件不一定如此：Ubuntu 软件包中的 Maven 3.8.7 会用 `maven-compiler-plugin` 3.1，默认 `source/target` 为 1.5，直接 `mvn test` 会报 `Source option 5 is no longer supported`。这时加上：

```bash
mvn test -Dmaven.compiler.source=8 -Dmaven.compiler.target=8
```

## 目录结构

```text
.
├── javaBase/                 接口、抽象类、枚举、构造方法
├── javaDemo/                 聚合工程，另有若干未纳入模块的源文件
│   ├── Car.java              默认包：Car 内部直接 new ElectricEngine
│   ├── Engine.java           以及 CombustionEngine、ElectricEngine
│   ├── ReflectionExample.java
│   ├── Greeting.java         只有注解定义，读取示例在 javaDemo1
│   ├── DotCom/               未完成的简易战舰草稿，当前无法编译
│   ├── ErrorHandle/          main 打印 Hello World；test 目录是 MIDI / Swing 示例
│   ├── Gui12/                main 打印 Hello World；test 目录是 Swing 界面示例
│   └── FileInputOutput/      文件、序列化、线程、Socket、泛型
├── javaDemo1/                手动注入 + 自定义注解
├── kotlinBase/               Kotlin 语法练习（源码放在 src/main/java）
├── springdemo/               Java Config 显式 @Bean
├── springDemo1/              组件扫描 + 构造器注入
└── xmlDIDemo/                XML 构造器注入（basic-config.xml）
```

仓库里没有界面截图。`javaDemo` 下的 `*.class`、`foo.ser`、`foo.txt` 以及各模块 `target/` 是本地编译产物，阅读时以源码为准。

## 环境要求

- JDK 17 或更高（Spring Boot 3.2.2 的要求）。验证环境为 OpenJDK 21。
- Maven 3.9 或更高。三个 Spring 模块也可以只用各自目录里的 `./mvnw`，不必预先安装 Maven。
- 需要能访问 Maven Central，以下载依赖。
- `ErrorHandle`、`Gui12` 里的 Swing / MIDI 示例需要图形界面和音频设备。无桌面环境时不要把它们当作可运行的主路径。

## 安装与运行

下面的命令都在对应子目录中执行。仓库根目录没有聚合 POM，不要在根目录执行 `mvn`。

### javaBase

练习入口是 `org.example.App`：构造一个 `Cat` 并调用 `test()`，控制台输出 `dsadas`。`abstractTest` 包里还有抽象类 `Animal`、`Dog`、`ADog` 和枚举 `Season`；`generator` 包练习构造方法；`interfaceTest` 包练习 `Shape` 以及抽象类实现接口。

```bash
cd javaBase
mvn test
java -cp target/classes org.example.App
```

`mvn test` 会跑 JUnit 3 的 `AppTest`（断言为真）。已在 Maven 3.9.5 + JDK 21 上通过。

### javaDemo1

`App` 分别把 `CombunstionEngine` 和 `ElectricEngine` 传进 `Car` 的构造器。`AnnotationReader` 用反射找到 `GreetingExample` 上的 `@Greeting` 并调用方法。

```bash
cd javaDemo1
mvn -DskipTests package
java -cp target/classes org.example.App
java -cp target/classes org.example.AnnotationReader
```

已验证输出：

```text
燃油引擎启动
电动引擎启动
Greeting message: 您好
这是一个自定义注解的方法
```

`mvn test` 同样可以通过，测试类是 Maven 原型生成的 `AppTest`。

### kotlinBase

源码混有 Kotlin 与少量 Java，主题包括变量、空安全、条件与 `when`、循环、集合、类与继承、可见性、Lambda，以及 `SmartDevice` / `SmartTvDevice` / `SmartLightDevice` 一组类。文件级 `main` 编译后的类名是文件名的驼峰形式加 `Kt` 后缀，例如 `variable.kt` → `org.example.VariableKt`。

POM 没有配置 `exec-maven-plugin`。可以直接用插件坐标运行，依赖会自动进入 classpath：

```bash
cd kotlinBase
mvn -q org.codehaus.mojo:exec-maven-plugin:3.5.0:java \
  -Dexec.mainClass=org.example.VariableKt \
  -Dexec.classpathScope=compile
```

把 `exec.mainClass` 换成其他入口即可，例如：

| 源文件 | `exec.mainClass` |
| --- | --- |
| `variable.kt` | `org.example.VariableKt` |
| `condition.kt` | `org.example.ConditionKt` |
| `NullTest.kt` | `org.example.NullTestKt` |
| `lambdaTest/LambdaExample.kt` | `org.example.lambdaTest.LambdaExampleKt` |
| `SmartDevice.kt` | `org.example.SmartDeviceKt` |

`mvn test` 已通过：`AppTest` 为 JUnit 3 原型测试；`SmartDevicesTest` 是空测试类，其中的 `main` 不会被 JUnit 3 执行。上面的 `VariableKt` 命令已实际跑通。只把 `target/classes` 放进 classpath、不带 `kotlin-stdlib` 时，Kotlin 入口会抛出 `NoClassDefFoundError: kotlin/jvm/internal/Intrinsics`。

### javaDemo

#### 默认包里的独立源文件

这些文件不在任何 Maven 模块的 `src` 中，`javaDemo/pom.xml` 的 `<modules>` 也没有包含它们。在 `javaDemo` 目录用 `javac` 编译：

```bash
cd javaDemo
javac Car.java Engine.java ElectricEngine.java CombustionEngine.java
java Car

javac ReflectionExample.java
java ReflectionExample
```

`Car` 输出 `电动引擎启动`。`ReflectionExample` 会打印类名，并把姓名改成 `Jane Doedsad`、年龄改成 `35`。两条命令均已验证。

`DotCom/SimpleDotCom.java` 是空类。`SimpleDotComTestDriver.java` 引用了不存在的变量和方法，并且把字符串写成了字符字面量 `'hit'`，`javac` 无法通过。这是未完成的草稿。

#### Maven 子模块

父 POM 的 `packaging` 是 `pom`，模块为 `ErrorHandle`、`Gui12`、`FileInputOutput`。

```bash
cd javaDemo
mvn -DskipTests compile
```

该命令已通过。不要对整个聚合工程执行 `mvn test`：`FileInputOutput/pom.xml` 没有声明 JUnit，而 `src/test/java/org/example/AppTest.java` 继承了 `junit.framework.TestCase`，测试编译会失败。`ErrorHandle` 和 `Gui12` 单独执行 `mvn test` 可以通过，但测试类里没有 JUnit 测试方法，结果是 `Tests run: 0`。真正的示例是这些类自己的 `main`。

`FileInputOutput` 可运行的入口：

```bash
cd javaDemo/FileInputOutput
mvn -q -DskipTests compile
java -cp target/classes org.example.ThreadTest
java -cp target/classes org.example.FileStrOutput
```

`ThreadTest` 启动一条线程并交替打印 `top o' the stack` 与 `back in main`，已验证。`FileStrOutput` 在当前目录写出 `foo.txt`，内容为 `hello foo`。

其余类的现状：

- `FileOutput` 的 `main` 只保留了反序列化，序列化代码被注释掉。它会读取**当前工作目录**下的 `foo.ser`。仓库里已有 `javaDemo/foo.ser`，在 `FileInputOutput` 目录直接运行会因找不到文件而抛出 `FileNotFoundException`。
- `DailyAdviceServer` 在 `4242` 端口循环 `accept`，不会自行退出。`DailyAdviceClient` 连接 `127.0.0.1:4242`。需要先起服务端再起客户端。
- `GenericsLearning`、`GenericsTest` 里的 `main` 不是 `static`，不能用 `java` 直接启动。`Person` 只实现了 `Comparable`。

`ErrorHandle` 的 `MusicTest` 尝试获取 MIDI `Sequencer`；`JavaWindow`、`MyDrawPanel` 创建 Swing 窗口。`Gui12` 的 `test` 目录包含 `GuiTest`、`TwoButtons`、`SimpleGui3C`、`SimpleAnimation`、`LayoutManagerView`、`MyDrawPanel`。这些类都带有 `main`，但依赖桌面环境，本次未在无图形界面的环境中运行。

### springdemo、springDemo1、xmlDIDemo

三个模块的 `main` 都没有调用 `SpringApplication.run`（对应代码处于注释中）。它们只创建自己的 `ApplicationContext`，取出 `Car` 并调用 `start()`，打印一行后退出。`application.properties` 是空的，也没有 HTTP 端口。

| 模块 | 装配方式 | 已验证的控制台输出 |
| --- | --- | --- |
| `springdemo` | `AnnotationConfig` 里手写四个 `@Bean` | `燃油引擎启动` |
| `springDemo1` | `@ComponentScan("com.example.springdemo1")`，`Car`、`CombunstionEngine`、`Camshaft`、`Crankshaft` 为 `@Component` | `燃油引擎启动` |
| `xmlDIDemo` | `basic-config.xml` 用 `<constructor-arg>` 注入 | `黑恶嘿嘿` |

```bash
cd springdemo          # 或 springDemo1、xmlDIDemo
./mvnw -DskipTests package
java -jar target/springdemo-0.0.1-SNAPSHOT.jar
```

另外两个包名分别是 `target/springDemo1-0.0.1-SNAPSHOT.jar` 和 `target/xmlDIDemo-0.0.1-SNAPSHOT.jar`。Wrapper 在未设置 `JAVA_HOME` 时会打印警告，只要 `java` 在 `PATH` 上仍可完成构建。

三个模块的 `./mvnw test` 均已通过。测试只有一个空的 `contextLoads()`，它启动 Spring 测试上下文，不会执行上面的 `main`，因此也不会打印引擎启动语句。`xmlDIDemo` 的 XML 不会被 `@SpringBootTest` 加载。

## 备注

- 学习代码里保留了原型生成的 `Hello World`、`AppTest`，以及未接上的类（例如 `xmlDIDemo` 的空 `AnnotationConfig`、`javaDemo1` 里被注释掉的 `CombustionCar` / `ElectricCar`）。
- `javaDemo/pom.xml` 的 `<name>` 写成了 `javaDemo1`，`artifactId` 仍是 `javaDemo`。
- 部分 Socket、MIDI 和 Swing 示例的题目与《Head First Java》中的练习相近，这里只是个人摘录，仓库不包含书中原文。
- 仓库没有单独的文档站，也没有截图。
