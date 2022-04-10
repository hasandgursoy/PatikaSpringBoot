package com.hasangursoy.patikaspringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@Builder
public class BeanDto {

    private Long id;
    private String beanName;
    private String beanData;

    //Starting
    public void initialBeanMethod(){

        log.info("I'm in before the bean starts ");
        System.out.println("Bean baslamadan once calisacak method");
    }

    //Finish
    public void destroyBeanMethod(){

        log.info("Bean bittikden sonra ben varım");
        System.err.println("Bean bittikden sonra calisacak method");

    }



}
