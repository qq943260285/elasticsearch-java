/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.SimpleQueryStringFlag">API
 *      specification</a>
 */
@JsonpDeserializable
public enum SimpleQueryStringFlag implements JsonEnum {
	/**
	 * Disables all operators.
	 */
	None("NONE"),

	/**
	 * Enables the <code>+</code> AND operator.
	 */
	And("AND"),

	/**
	 * Enables the <code>-</code> NOT operator.
	 */
	Not("NOT"),

	/**
	 * Enables the <code>\|</code> OR operator.
	 */
	Or("OR"),

	/**
	 * Enables the <code>*</code> prefix operator.
	 */
	Prefix("PREFIX"),

	/**
	 * Enables the <code>&quot;</code> quotes operator used to search for phrases.
	 */
	Phrase("PHRASE"),

	/**
	 * Enables the <code>(</code> and <code>)</code> operators to control operator
	 * precedence.
	 */
	Precedence("PRECEDENCE"),

	/**
	 * Enables <code>\</code> as an escape character.
	 */
	Escape("ESCAPE"),

	/**
	 * Enables whitespace as split characters.
	 */
	Whitespace("WHITESPACE"),

	/**
	 * Enables the <code>~N</code> operator after a word, where <code>N</code> is an
	 * integer denoting the allowed edit distance for matching.
	 */
	Fuzzy("FUZZY"),

	/**
	 * Enables the <code>~N</code> operator, after a phrase where <code>N</code> is
	 * the maximum number of positions allowed between matching tokens. Synonymous
	 * to <code>SLOP</code>.
	 */
	Near("NEAR"),

	/**
	 * Enables the <code>~N</code> operator, after a phrase where <code>N</code> is
	 * maximum number of positions allowed between matching tokens. Synonymous to
	 * <code>NEAR</code>.
	 */
	Slop("SLOP"),

	/**
	 * Enables all optional operators.
	 */
	All("ALL"),

	;

	private final String jsonValue;

	SimpleQueryStringFlag(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<SimpleQueryStringFlag> _DESERIALIZER = new JsonEnum.Deserializer<>(
			SimpleQueryStringFlag.values());
}
