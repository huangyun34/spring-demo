package com.my.spring.bean;

import org.springframework.context.annotation.ImportAware;
import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.core.type.AnnotationMetadata;

public class WeiYuan implements ImportAware {
    @Override
    public void setImportMetadata(AnnotationMetadata annotationMetadata) {
        //获取倒入这个类的类的注解信息
        MergedAnnotations annotations = annotationMetadata.getAnnotations();
    }
}
