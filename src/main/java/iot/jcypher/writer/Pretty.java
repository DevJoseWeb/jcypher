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

package iot.jcypher.writer;


public class Pretty {
	
	static final String INDENT="     ";

	public static void writeKeyword(String keyword, WriterContext context) {
		
	}
	
	public static void writeStatementSeparator(WriterContext context) {
		if (context.cypherFormat == Format.PRETTY_3) {
			context.buffer.append('\n');
			context.buffer.append(context.getLevelIndent());
			context.buffer.append(INDENT);
		} else
			context.buffer.append(' ');
	}
	
	public static void writePostClauseSeparator(WriterContext context) {
		if (context.inFunction)
			context.buffer.append(' ');
		else {
			if (context.cypherFormat == Format.PRETTY_2 ||
					context.cypherFormat == Format.PRETTY_3) {
				context.buffer.append('\n');
				context.buffer.append(context.getLevelIndent());
				context.buffer.append(INDENT);
			} else
				context.buffer.append(' ');
		}
	}
	
	public static void writePreClauseSeparator(WriterContext context) {
		if (context.inFunction)
			context.buffer.append(' ');
		else {
			if (context.cypherFormat == Format.PRETTY_1 ||
					context.cypherFormat == Format.PRETTY_2 ||
					context.cypherFormat == Format.PRETTY_3) {
				context.buffer.append('\n');
				context.buffer.append(context.getLevelIndent());
			} else
				context.buffer.append(' ');
		}
	}
	
	public static void writePreFunctionSeparator(WriterContext context) {
		if (context.cypherFormat == Format.PRETTY_2 ||
				context.cypherFormat == Format.PRETTY_3) {
			context.buffer.append('\n');
			context.buffer.append(context.getLevelIndent());
		} else
			context.buffer.append(' ');
	}
}