# com.hcs.Spring
2016-09-18

Spring-Boot 内置服务器 热部署

   1. Pom中直接添加依赖即可：
       
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <optional>true</optional>
        </dependency>
        
    2. 使用springloaded插件。
       pom 文件中添加
         
          <build>
	        <plugins>
	            <plugin>
	                <groupId>org.springframework.boot</groupId>
	                <artifactId>spring-boot-maven-plugin</artifactId>
	                <configuration>
	                    <fork>true</fork>
	                </configuration>
	                <dependencies>
	                    <dependency>
	                        <groupId>org.springframework</groupId>
	                        <artifactId>springloaded</artifactId>
	                        <version>1.2.3.RELEASE</version>
	                    </dependency>
	                </dependencies>
	            </plugin>
	        </plugins>
	    </build>    
	
	以上两种 在Eclipse 中没有效果 ;
	 
	 3. 设置 RunConfigurtions 
	 　　　  
	     1）右击项目 --> Properties ---> Run/Debug Settings  然后 Edit 
	     2）在Arguments 栏中    VMarguments 下  添加    springloaded-1.2.3.RELEASE.jar的路径;
	                  
	                       例如：     -javaagent:F:\spring\workspace\springloaded-1.2.3.RELEASE.jar -noverify
	　　　
	　　　