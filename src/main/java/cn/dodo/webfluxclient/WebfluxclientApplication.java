package cn.dodo.webfluxclient;

import cn.dodo.webfluxclient.api.IUserApi;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebfluxclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebfluxclientApplication.class, args);
    }



    @Bean
    FactoryBean<IUserApi> userApi() {
        return new FactoryBean<IUserApi>() {

            /**
             * 对应的类型
             * @return
             */
            @Override
            public Class<?> getObjectType() {
                return null;
            }

            /**
             * 返回代理对象
             */
            @Override
            public IUserApi getObject() throws Exception {
                return null;
            }
        };
    }



}
