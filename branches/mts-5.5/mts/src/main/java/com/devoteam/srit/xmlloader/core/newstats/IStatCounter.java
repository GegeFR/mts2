/*
* Copyright 2012 Devoteam http://www.devoteam.com
* DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
*
*
* This file is part of Multi-Protocol Test Suite (MTS).
*
* Multi-Protocol Test Suite (MTS) is free software: you can redistribute
* it and/or modify it under the terms of the GNU General Public License 
* as published by the Free Software Foundation, either version 3 of the 
* License.
* 
* Multi-Protocol Test Suite (MTS) is distributed in the hope that it will
* be useful, but WITHOUT ANY WARRANTY; without even the implied warranty 
* of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with Multi-Protocol Test Suite (MTS).  
* If not, see <http://www.gnu.org/licenses/>. 
*
*//*
 * IStatCounter.java
 *
 * Created on 23 janvier 2008, 11:53
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package com.devoteam.srit.xmlloader.core.newstats;

import java.io.Serializable;

/**
 * Interface that must be implemented by all counters held by the StatPool class
 * @author mjagodzinski
 */
public interface IStatCounter extends Serializable, Cloneable
{
    /**
     * Adds a value to the counter
     * @param value
     */
    public void addValue(Object value);

    /**
     * Adds a value to the counter with the possibility of specifying the timestamp
     * @param value
     */
    public void addValue(Object value, long timestamp);

    /**
     * Sums this counter values with values of another counter
     * @param operand
     */
    public void sum(IStatCounter operand);

    

    public IStatCounter clone();
}
