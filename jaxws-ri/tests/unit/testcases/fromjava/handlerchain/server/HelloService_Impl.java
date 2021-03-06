/*
 * Copyright (c) 1997, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package fromjava.handlerchain.server;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.soap.SOAPBinding;

/**
 */
@jakarta.jws.HandlerChain(
    name="",
    file="handlers.xml"
)
@WebService(name="Hello", serviceName="HelloService", targetNamespace="urn:test")
@SOAPBinding(style=SOAPBinding.Style.RPC)
public class HelloService_Impl {

    @WebMethod
    public int hello(@WebParam(name="x")int x) {
        System.out.println("HelloService_Impl received: " + x);
        return x;
    }

}
