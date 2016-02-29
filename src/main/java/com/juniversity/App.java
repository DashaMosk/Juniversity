package com.juniversity;

import com.juniversity.config.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by Daria_Moskalenko on 2/29/2016.
 */
@Component
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        App app = ctx.getBean(App.class);
    }
}
