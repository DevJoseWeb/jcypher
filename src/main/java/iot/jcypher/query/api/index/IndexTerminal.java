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

package iot.jcypher.query.api.index;

import iot.jcypher.query.api.APIObject;
import iot.jcypher.query.api.IClause;
import iot.jcypher.query.ast.index.IndexExpression;

public class IndexTerminal extends APIObject implements IClause {

	IndexTerminal(IndexExpression ix) {
		super();
		this.astNode = ix;
	}
}
