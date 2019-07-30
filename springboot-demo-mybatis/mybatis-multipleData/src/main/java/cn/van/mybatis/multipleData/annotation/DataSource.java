package cn.van.mybatis.multipleData.annotation;

import java.lang.annotation.*;

/**
 * Copyright (C), 2015-2019, 风尘博客
 * 公众号 : 风尘博客
 * FileName: DataSource
 *
 * @author: Van
 * Date:     2019-07-30 15:45
 * Description: 切换数据注解 可以用于类或者方法级别 方法级别优先级 > 类级别
 * Version： V1.0
 */
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    String value() default "master"; //该值即key值
}
