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

package iot.jcypher.query.values;

public class FunctionInstance implements IOperatorOrFunction {

	private Function function;
	private int numArgs;
	
	FunctionInstance(Function function, int numArgs) {
		super();
		this.function = function;
		this.numArgs = numArgs;
	}

	FunctionInstance(Function function) {
		this(function, 0);
	}

	int getNumArgs() {
		return numArgs;
	}

	void setNumArgs(int numArgs) {
		this.numArgs = numArgs;
	}

	Function getFunction() {
		return function;
	}
}
