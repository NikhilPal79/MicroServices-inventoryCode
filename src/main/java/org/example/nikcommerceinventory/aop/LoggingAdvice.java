package org.example.nikcommerceinventory.aop;

import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggingAdvice {

    Logger logger = LoggerFactory.getLogger(LoggingAdvice.class);

    /// logger.info(Instant.now()+ " Class: productController Method: addProduct started executing with Parameters " + product);


}
