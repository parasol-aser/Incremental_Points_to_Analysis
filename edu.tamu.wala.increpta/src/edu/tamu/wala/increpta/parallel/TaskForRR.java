/*******************************************************************************
 * Copyright (C) 2017 Bozhen Liu, Jeff Huang.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bozhen Liu, Jeff Huang - initial API and implementation
 ******************************************************************************/
package edu.tamu.wala.increpta.parallel;

import com.ibm.wala.util.intset.MutableIntSet;

import edu.tamu.wala.increpta.ipa.callgraph.propagation.IPAPointsToSetVariable;
import edu.tamu.wala.increpta.ipa.callgraph.propagation.IPAPropagationSystem;


public class TaskForRR {

  private IPAPointsToSetVariable first;
  private MutableIntSet targets;
  private IPAPropagationSystem system;

  public TaskForRR(IPAPointsToSetVariable first, MutableIntSet targets, IPAPropagationSystem system) {
    this.first = first;
    this.targets = targets;
    this.system = system;
  }


  public IPAPropagationSystem getPropagationSystem(){
    return system;
  }

  public MutableIntSet getTargets(){
    return targets;
  }

  public IPAPointsToSetVariable getUser(){
    return first;
  }

}
