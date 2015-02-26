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
package eu.databata.engine.model;

import java.io.File;

/**
 * @author Maksim Boiko  {@literal<mailto:max.boiko@gmail.com>}
 */
public class PropagationObject {
  private String moduleName;
  private String objectName;
  private ObjectType objectType;
  private String md5Hash;
  private File propagatedFile;
  private String version;
  
  public PropagationObject() {
  }
  
  public PropagationObject(String moduleName, String objectName, File propagatedFile, ObjectType objectType, String md5Hash) {
    this.moduleName = moduleName;
    this.objectName = objectName;
    this.propagatedFile = propagatedFile;
    this.objectType = objectType;
    this.md5Hash = md5Hash;
  }
  
  public String getModuleName() {
    return moduleName;
  }
  public void setModuleName(String moduleName) {
    this.moduleName = moduleName;
  }
  public String getObjectName() {
    return objectName;
  }
  public void setObjectName(String objectName) {
    this.objectName = objectName;
  }
  public ObjectType getObjectType() {
    return objectType;
  }
  public void setObjectType(ObjectType objectType) {
    this.objectType = objectType;
  }
  public String getMd5Hash() {
    return md5Hash;
  }
  public void setMd5Hash(String md5Hash) {
    this.md5Hash = md5Hash;
  }
  public File getPropagatedFile() {
    return propagatedFile;
  }
  public void setPropagatedFile(File propagatedFile) {
    this.propagatedFile = propagatedFile;
  }
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }


  public enum ObjectType {
    VIEW,
    TRIGGER,
    PACKAGE_HEADER,
    PACKAGE,
    FUNCTION,
    PROCEDURE;
    
    public String getSqlName() {
      if(this.name().contains("HEADER")) {
        return "PACKAGE";
      }
      
      return this.name();
    }
  }
}
