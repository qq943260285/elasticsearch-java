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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.get_settings.Response
@JsonpDeserializable
public class GetClusterSettingsResponse implements JsonpSerializable {
	private final Map<String, JsonData> persistent;

	private final Map<String, JsonData> transient_;

	private final Map<String, JsonData> defaults;

	// ---------------------------------------------------------------------------------------------

	private GetClusterSettingsResponse(Builder builder) {

		this.persistent = ModelTypeHelper.unmodifiableRequired(builder.persistent, this, "persistent");
		this.transient_ = ModelTypeHelper.unmodifiableRequired(builder.transient_, this, "transient_");
		this.defaults = ModelTypeHelper.unmodifiable(builder.defaults);

	}

	public static GetClusterSettingsResponse of(Function<Builder, ObjectBuilder<GetClusterSettingsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code persistent}
	 */
	public final Map<String, JsonData> persistent() {
		return this.persistent;
	}

	/**
	 * Required - API name: {@code transient}
	 */
	public final Map<String, JsonData> transient_() {
		return this.transient_;
	}

	/**
	 * API name: {@code defaults}
	 */
	public final Map<String, JsonData> defaults() {
		return this.defaults;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (ModelTypeHelper.isDefined(this.persistent)) {
			generator.writeKey("persistent");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.persistent.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.transient_)) {
			generator.writeKey("transient");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.transient_.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.defaults)) {
			generator.writeKey("defaults");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.defaults.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetClusterSettingsResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetClusterSettingsResponse> {
		private Map<String, JsonData> persistent;

		private Map<String, JsonData> transient_;

		@Nullable
		private Map<String, JsonData> defaults;

		/**
		 * Required - API name: {@code persistent}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>persistent</code>. Use
		 * <code>ModelTypeHelper.resetMap()</code> if you need to reset
		 * <code>persistent</code> to <code>null</code>.
		 * 
		 * @see ModelTypeHelper#resetMap()
		 */
		public final Builder persistent(Map<String, JsonData> map) {
			this.persistent = _mapPutAll(this.persistent, map);
			return this;
		}

		/**
		 * Required - API name: {@code persistent}
		 * <p>
		 * Adds an entry to <code>persistent</code>.
		 */
		public final Builder persistent(String key, JsonData value) {
			this.persistent = _mapPut(this.persistent, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code transient}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>transient_</code>. Use
		 * <code>ModelTypeHelper.resetMap()</code> if you need to reset
		 * <code>transient_</code> to <code>null</code>.
		 * 
		 * @see ModelTypeHelper#resetMap()
		 */
		public final Builder transient_(Map<String, JsonData> map) {
			this.transient_ = _mapPutAll(this.transient_, map);
			return this;
		}

		/**
		 * Required - API name: {@code transient}
		 * <p>
		 * Adds an entry to <code>transient_</code>.
		 */
		public final Builder transient_(String key, JsonData value) {
			this.transient_ = _mapPut(this.transient_, key, value);
			return this;
		}

		/**
		 * API name: {@code defaults}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>defaults</code>. Use
		 * <code>ModelTypeHelper.resetMap()</code> if you need to reset
		 * <code>defaults</code> to <code>null</code>.
		 * 
		 * @see ModelTypeHelper#resetMap()
		 */
		public final Builder defaults(Map<String, JsonData> map) {
			this.defaults = _mapPutAll(this.defaults, map);
			return this;
		}

		/**
		 * API name: {@code defaults}
		 * <p>
		 * Adds an entry to <code>defaults</code>.
		 */
		public final Builder defaults(String key, JsonData value) {
			this.defaults = _mapPut(this.defaults, key, value);
			return this;
		}

		/**
		 * Builds a {@link GetClusterSettingsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetClusterSettingsResponse build() {
			_checkSingleUse();

			return new GetClusterSettingsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetClusterSettingsResponse}
	 */
	public static final JsonpDeserializer<GetClusterSettingsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetClusterSettingsResponse::setupGetClusterSettingsResponseDeserializer);

	protected static void setupGetClusterSettingsResponseDeserializer(
			ObjectDeserializer<GetClusterSettingsResponse.Builder> op) {

		op.add(Builder::persistent, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "persistent");
		op.add(Builder::transient_, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "transient");
		op.add(Builder::defaults, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "defaults");

	}

}