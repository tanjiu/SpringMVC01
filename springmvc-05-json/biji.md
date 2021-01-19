springmvc配置文件中有一个解决spirngmvc返回json数据时的乱码问题的代码
这个项目将数据转化为json数据使用的是jackson
@controller和@ResponseBody一起使用返回json字符串
@RestController相当于以上两个注解的集合
使用jackson也需要上面的注解配合才可返回json串
依赖如下：
  <!--        json解析工具-->
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.10.2</version>
        </dependency>

看一下pojo中的user类，
lombok包可以通过注解来设置属性的set get 有参无参构造方法，比较简便


utils包里面的工具类可以用来将数据转化为json串，包括时间，要注意以后复用


使用jackson转化json数据步骤
首先导入依赖
然后在springmvc配置文件中配置乱码解决代码
然后复制utils下的工具类，调用即可
注意注解要么用@Controller和@ResponseBody
要么使用@RestController


下面是FastJson
添加依赖即可使用
但是要注意要将新加入的依赖加入到lib包中，否则访问会出错
String jsonString = JSON.toJSONString(user);即可将数据转化为Json
