/*
 * Copyright 2013 Red Hat Inc. and/or its affiliates and other contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.switchyard.quickstarts.jca.inflow;

import org.switchyard.component.bean.Service;

/**
 * A POJO Service implementation.
 *
 * @author Daniel Bevenius
 *
 */
@Service(GreetingService.class)
public class GreetingServiceBean implements GreetingService {

    @Override
    public final void english(final Person person) {
        System.out.println("Hello there " + person.getName() + " :-) ");
    }

    @Override
    public void spanish(Person person) {
        System.out.println("Hola " + person.getName() + " :-) ");
    }

    @Override
    public void japanese(Person person) {
        System.out.println("こんにちは " + person.getName() + " :-) ");
    }
}
