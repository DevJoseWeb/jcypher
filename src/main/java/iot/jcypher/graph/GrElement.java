/************************************************************************
 * Copyright (c) 2014 IoT-Solutions e.U.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ************************************************************************/

package iot.jcypher.graph;

import iot.jcypher.result.util.ResultHandler;

public abstract class GrElement {

	protected ResultHandler resultHandler;
	private long id;
	private String name;

	GrElement(ResultHandler resultHandler, long id, String name) {
		super();
		this.resultHandler = resultHandler;
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}
	
}
