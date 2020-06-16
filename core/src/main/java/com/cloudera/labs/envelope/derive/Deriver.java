/*
 * Copyright (c) 2015-2020, Cloudera, Inc. All Rights Reserved.
 *
 * Cloudera, Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"). You may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for
 * the specific language governing permissions and limitations under the
 * License.
 */

package com.cloudera.labs.envelope.derive;

import com.cloudera.labs.envelope.component.Component;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

import java.util.Map;

/** //processor实际上是
 * Derivers create new DataFrames derived from DataFrames already loaded into the Spark application.
 * Custom derivers should directly implement this interface.
 */
public interface Deriver extends Component {

  /**
   * Derive a new DataFrame from the DataFrames of the dependency steps.
   * @param dependencies The map of step names to step DataFrames.
   * @return The derived DataFrame.
   * @throws Exception
   */
  Dataset<Row> derive(Map<String, Dataset<Row>> dependencies) throws Exception;

}
