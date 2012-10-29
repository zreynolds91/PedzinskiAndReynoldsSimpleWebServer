/*
 * Logger.java
 * Oct 29, 2012
 *
 * Simple Web Server (SWS) for EE407/507 and CS455/555
 * 
 * Copyright (C) 2011 Chandan Raj Rupakheti, Clarkson University
 * 
 * This program is free software: you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License 
 * as published by the Free Software Foundation, either 
 * version 3 of the License, or any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/lgpl.html>.
 * 
 * Contact Us:
 * Chandan Raj Rupakheti (rupakhcr@clarkson.edu)
 * Department of Electrical and Computer Engineering
 * Clarkson University
 * Potsdam
 * NY 13699-5722
 * http://clarkson.edu/~rupakhcr
 */
 
package logger;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * 
 * @author Chandan R. Rupakheti (rupakhcr@clarkson.edu)
 */
public class Logger {
	FileWriter fstream;
	public Logger(){
		  try{
			  // Create file 
			  
			  fstream = new FileWriter("Log.txt");
			
			 
		  }catch (Exception e){//Catch exception if any
			  
			  
		  }
			  
	}
	public void write(String logMessage){
		try{
			BufferedWriter out = new BufferedWriter(fstream);
			  out.write(logMessage);
			  out.newLine();
			  //Close the output stream
			  out.close();
		}catch(Exception e){
			
		}
	}

	}

