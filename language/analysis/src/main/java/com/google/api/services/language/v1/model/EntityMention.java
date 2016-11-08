/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-10-19 16:23:00 PDT)
 * on 2016-10-19 at 23:23:02 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.language.v1.model;

/**
 * Represents a mention for an entity in the text. Currently, proper noun mentions are supported.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Natural Language API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EntityMention extends com.google.api.client.json.GenericJson {

  /**
   * The mention text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextSpan text;

  /**
   * The type of the entity mention.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The mention text.
   * @return value or {@code null} for none
   */
  public TextSpan getText() {
    return text;
  }

  /**
   * The mention text.
   * @param text text or {@code null} for none
   */
  public EntityMention setText(TextSpan text) {
    this.text = text;
    return this;
  }

  /**
   * The type of the entity mention.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the entity mention.
   * @param type type or {@code null} for none
   */
  public EntityMention setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public EntityMention set(String fieldName, Object value) {
    return (EntityMention) super.set(fieldName, value);
  }

  @Override
  public EntityMention clone() {
    return (EntityMention) super.clone();
  }

}
