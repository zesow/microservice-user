/*===================================================================================
 *                    Copyright(c) 2019 Gus
 *
 * Project            : user-domain
 * Source File Name   : com.gus.microservice.user.domain.lifecycle.ProxyLifecycle.java
 * Description        :
 * Author             : user
 * Version            : 1.0.0
 * File Name related  :
 * Class Name related :
 * Created Date       : 2019. 4. 4.
 * Updated Date       : 2019. 4. 4.
 * Last modifier      : user
 * Updated content    : 최초작성
 *
 *==================================================================================*/
package com.gus.microservice.user.domain.lifecycle;

import com.gus.microservice.user.domain.proxy.UserEventProducer;
import com.gus.microservice.user.domain.proxy.YardProxy;

/*
 * ProxyLifecycle.java
 *
 * @author user
 * @version 1.0.0
 * @since 2019. 4. 4.
 * 
 */

public interface ProxyLifecycle {
    
    YardProxy requestYardProxy();
	UserEventProducer requestUserEventProducer();
}
