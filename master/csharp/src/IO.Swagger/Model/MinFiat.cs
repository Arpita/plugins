/* 
 * Coinsecure Api Documentation
 *
 * To generate an API key, please visit <a href='https://coinsecure.in/api' target='_new' class='homeapi'>https://coinsecure.in/api</a>.<br>Guidelines for use can be accessed at <a href='https://api.coinsecure.in/v1/guidelines'>https://api.coinsecure.in/v1/guidelines</a>.<br>Programming Language Libraries for use can be accessed at <a href='https://api.coinsecure.in/v1/code-libraries'>https://api.coinsecure.in/v1/code-libraries</a>.
 *
 * OpenAPI spec version: 1.0b
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
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

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace IO.Swagger.Model
{
    /// <summary>
    /// MinFiat
    /// </summary>
    [DataContract]
    public partial class MinFiat :  IEquatable<MinFiat>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MinFiat" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected MinFiat() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="MinFiat" /> class.
        /// </summary>
        /// <param name="_MinFiat">_MinFiat (required).</param>
        public MinFiat(long? _MinFiat = null)
        {
            // to ensure "_MinFiat" is required (not null)
            if (_MinFiat == null)
            {
                throw new InvalidDataException("_MinFiat is a required property for MinFiat and cannot be null");
            }
            else
            {
                this._MinFiat = _MinFiat;
            }
        }
        
        /// <summary>
        /// Gets or Sets _MinFiat
        /// </summary>
        [DataMember(Name="minFiat", EmitDefaultValue=false)]
        public long? _MinFiat { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MinFiat {\n");
            sb.Append("  _MinFiat: ").Append(_MinFiat).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            return this.Equals(obj as MinFiat);
        }

        /// <summary>
        /// Returns true if MinFiat instances are equal
        /// </summary>
        /// <param name="other">Instance of MinFiat to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MinFiat other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this._MinFiat == other._MinFiat ||
                    this._MinFiat != null &&
                    this._MinFiat.Equals(other._MinFiat)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            // credit: http://stackoverflow.com/a/263416/677735
            unchecked // Overflow is fine, just wrap
            {
                int hash = 41;
                // Suitable nullity checks etc, of course :)
                if (this._MinFiat != null)
                    hash = hash * 59 + this._MinFiat.GetHashCode();
                return hash;
            }
        }
    }

}
