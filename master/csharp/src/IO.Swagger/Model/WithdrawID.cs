/* 
 * Coinsecure Api Documentation
 *
 * To generate an API key, please visit <a href='https://coinsecure.in/api' target='_new' class='homeapi'>https://coinsecure.in/api</a>.<br>Guidelines for use can be accessed at <a href='https://api.coinsecure.in/v1/guidelines'>https://api.coinsecure.in/v1/guidelines</a>.<br>Programming Language Libraries for use can be accessed at <a href='https://api.coinsecure.in/v1/code-libraries'>https://api.coinsecure.in/v1/code-libraries</a>.
 *
 * OpenAPI spec version: beta
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
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;

namespace IO.Swagger.Model
{
    /// <summary>
    /// WithdrawID
    /// </summary>
    [DataContract]
    public partial class WithdrawID :  IEquatable<WithdrawID>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="WithdrawID" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected WithdrawID() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="WithdrawID" /> class.
        /// </summary>
        /// <param name="_WithdrawID">_WithdrawID (required).</param>
        public WithdrawID(string _WithdrawID = null)
        {
            // to ensure "_WithdrawID" is required (not null)
            if (_WithdrawID == null)
            {
                throw new InvalidDataException("_WithdrawID is a required property for WithdrawID and cannot be null");
            }
            else
            {
                this._WithdrawID = _WithdrawID;
            }
        }
        
        /// <summary>
        /// Gets or Sets _WithdrawID
        /// </summary>
        [DataMember(Name="withdrawID", EmitDefaultValue=false)]
        public string _WithdrawID { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class WithdrawID {\n");
            sb.Append("  _WithdrawID: ").Append(_WithdrawID).Append("\n");
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
            return this.Equals(obj as WithdrawID);
        }

        /// <summary>
        /// Returns true if WithdrawID instances are equal
        /// </summary>
        /// <param name="other">Instance of WithdrawID to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WithdrawID other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this._WithdrawID == other._WithdrawID ||
                    this._WithdrawID != null &&
                    this._WithdrawID.Equals(other._WithdrawID)
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
                if (this._WithdrawID != null)
                    hash = hash * 59 + this._WithdrawID.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
