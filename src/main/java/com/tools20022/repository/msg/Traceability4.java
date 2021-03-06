/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification77;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of partners involved in exchange from the ATM to the issuer,
 * with the relative timestamp of their exchanges.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Traceability4#mmRelayIdentification
 * Traceability4.mmRelayIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Traceability4#mmSequenceNumber
 * Traceability4.mmSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Traceability4#mmTraceDateTimeIn
 * Traceability4.mmTraceDateTimeIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Traceability4#mmTraceDateTimeOut
 * Traceability4.mmTraceDateTimeOut}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Traceability4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of partners involved in exchange from the ATM to the issuer, with the relative timestamp of their exchanges."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Traceability4", propOrder = {"relayIdentification", "sequenceNumber", "traceDateTimeIn", "traceDateTimeOut"})
public class Traceability4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RlayId", required = true)
	protected GenericIdentification77 relayIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification77
	 * GenericIdentification77}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Traceability4 Traceability4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RlayId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelayIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a partner of a message exchange."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Traceability4, GenericIdentification77> mmRelayIdentification = new MMMessageAssociationEnd<Traceability4, GenericIdentification77>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Traceability4.mmObject();
			isDerived = false;
			xmlTag = "RlayId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelayIdentification";
			definition = "Identification of a partner of a message exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification77.mmObject();
		}

		@Override
		public GenericIdentification77 getValue(Traceability4 obj) {
			return obj.getRelayIdentification();
		}

		@Override
		public void setValue(Traceability4 obj, GenericIdentification77 value) {
			obj.setRelayIdentification(value);
		}
	};
	@XmlElement(name = "SeqNb")
	protected Max35Text sequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Traceability4 Traceability4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the relay node in the path, to enable identification of several hosts in parallel."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Traceability4, Optional<Max35Text>> mmSequenceNumber = new MMMessageAttribute<Traceability4, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Traceability4.mmObject();
			isDerived = false;
			xmlTag = "SeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumber";
			definition = "Identification of the relay node in the path, to enable identification of several hosts in parallel.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Traceability4 obj) {
			return obj.getSequenceNumber();
		}

		@Override
		public void setValue(Traceability4 obj, Optional<Max35Text> value) {
			obj.setSequenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "TracDtTmIn", required = true)
	protected ISODateTime traceDateTimeIn;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Traceability4 Traceability4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TracDtTmIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TraceDateTimeIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time of incoming data exchange for relaying or processing."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Traceability4, ISODateTime> mmTraceDateTimeIn = new MMMessageAttribute<Traceability4, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Traceability4.mmObject();
			isDerived = false;
			xmlTag = "TracDtTmIn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TraceDateTimeIn";
			definition = "Date and time of incoming data exchange for relaying or processing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Traceability4 obj) {
			return obj.getTraceDateTimeIn();
		}

		@Override
		public void setValue(Traceability4 obj, ISODateTime value) {
			obj.setTraceDateTimeIn(value);
		}
	};
	@XmlElement(name = "TracDtTmOut", required = true)
	protected ISODateTime traceDateTimeOut;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Traceability4 Traceability4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TracDtTmOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TraceDateTimeOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time of the outgoing exchange for relaying or processing."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Traceability4, ISODateTime> mmTraceDateTimeOut = new MMMessageAttribute<Traceability4, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Traceability4.mmObject();
			isDerived = false;
			xmlTag = "TracDtTmOut";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TraceDateTimeOut";
			definition = "Date and time of the outgoing exchange for relaying or processing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Traceability4 obj) {
			return obj.getTraceDateTimeOut();
		}

		@Override
		public void setValue(Traceability4 obj, ISODateTime value) {
			obj.setTraceDateTimeOut(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Traceability4.mmRelayIdentification, com.tools20022.repository.msg.Traceability4.mmSequenceNumber,
						com.tools20022.repository.msg.Traceability4.mmTraceDateTimeIn, com.tools20022.repository.msg.Traceability4.mmTraceDateTimeOut);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Traceability4";
				definition = "Identification of partners involved in exchange from the ATM to the issuer, with the relative timestamp of their exchanges.";
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification77 getRelayIdentification() {
		return relayIdentification;
	}

	public Traceability4 setRelayIdentification(GenericIdentification77 relayIdentification) {
		this.relayIdentification = Objects.requireNonNull(relayIdentification);
		return this;
	}

	public Optional<Max35Text> getSequenceNumber() {
		return sequenceNumber == null ? Optional.empty() : Optional.of(sequenceNumber);
	}

	public Traceability4 setSequenceNumber(Max35Text sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
		return this;
	}

	public ISODateTime getTraceDateTimeIn() {
		return traceDateTimeIn;
	}

	public Traceability4 setTraceDateTimeIn(ISODateTime traceDateTimeIn) {
		this.traceDateTimeIn = Objects.requireNonNull(traceDateTimeIn);
		return this;
	}

	public ISODateTime getTraceDateTimeOut() {
		return traceDateTimeOut;
	}

	public Traceability4 setTraceDateTimeOut(ISODateTime traceDateTimeOut) {
		this.traceDateTimeOut = Objects.requireNonNull(traceDateTimeOut);
		return this;
	}
}