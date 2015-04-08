/**
 *   Copyright 2014 Nortal AS
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package eu.databata.engine.exeptions;

import java.sql.Connection;

import org.hsqldb.cmdline.SqlFile;

import java.sql.SQLException;

/**
 * We want to skip SQL exceptions with certain error codes and continue invocation of the propagator.
 * 
 * @author Maksim Boiko  {@literal<mailto:max.boiko@gmail.com>}
 */
public interface SQLExceptionHandler {
  boolean isHandled(SQLException e, String sql, SqlFile sqlFile, Connection newConnection);
}
