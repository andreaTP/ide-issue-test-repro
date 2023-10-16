package io.apicurio.registry.rest.client.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * All error responses, whether `4xx` or `5xx` will include one of these as the responsebody.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RuleViolationError extends Error implements Parsable {
    /**
     * List of rule violation causes.
     */
    private java.util.List<RuleViolationCause> causes;
    /**
     * Instantiates a new RuleViolationError and sets the default values.
     */
    public RuleViolationError() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RuleViolationError
     */
    @jakarta.annotation.Nonnull
    public static RuleViolationError createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RuleViolationError();
    }
    /**
     * Gets the causes property value. List of rule violation causes.
     * @return a RuleViolationCause
     */
    @jakarta.annotation.Nullable
    public java.util.List<RuleViolationCause> getCauses() {
        return this.causes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("causes", (n) -> { this.setCauses(n.getCollectionOfObjectValues(RuleViolationCause::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("causes", this.getCauses());
    }
    /**
     * Sets the causes property value. List of rule violation causes.
     * @param value Value to set for the causes property.
     */
    public void setCauses(@jakarta.annotation.Nullable final java.util.List<RuleViolationCause> value) {
        this.causes = value;
    }
}
