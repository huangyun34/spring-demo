package com.my.spring.importbean;

import com.my.spring.bean.WeiYuan;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author huangyun
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({WeiYuan.class})
public @interface WeiYuanImport {
}
