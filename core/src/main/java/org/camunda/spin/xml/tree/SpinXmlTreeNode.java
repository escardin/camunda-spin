/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.spin.xml.tree;

import org.camunda.spin.Spin;
import org.camunda.spin.logging.SpinCoreLogger;
import org.camunda.spin.logging.SpinLogger;

/**
 * An element in a tree-oriented XML data format.
 *
 * @author Sebastian Menski
 * @author Daniel Meyer
 *
 */
public abstract class SpinXmlTreeNode<T extends SpinXmlTreeNode<?>> extends Spin<T> {

  protected static final SpinCoreLogger LOG = SpinLogger.CORE_LOGGER;

  /**
   * Returns the local name of the node without namespace or prefix.
   *
   * @return the name of the node
   */
  public abstract String name();

  /**
   * Returns the namespace uri of the node and not the prefix.
   *
   * @return the namespace of the node
   */
  public abstract String namespace();

  /**
   * Checks if the node has a given namespace.
   *
   * @param namespace the namespace to check
   * @return true if the node has the same namespace
   */
  public abstract boolean hasNamespace(String namespace);
  
  public <C> C mapTo(Class<C> type) {
   throw LOG.methodNotImplement("mapTo");
  }
  
  public <C> C mapTo(String type) {
    throw LOG.methodNotImplement("mapTo");
  }
  
}
