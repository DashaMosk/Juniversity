package com.juniversity.config;

import org.springframework.context.annotation.*;

/**
 * Created by Daria_Moskalenko on 2/29/2016.
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan("com.juniversity")
@Import(HibernateConfiguration.class)
public class SpringConfiguration {
}
