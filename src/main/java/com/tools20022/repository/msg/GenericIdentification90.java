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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PartyType14Code;
import com.tools20022.repository.codeset.PartyType4Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Min2Max3AlphaText;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.IdentificationIssuerRole;
import com.tools20022.repository.entity.OrganisationName;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of an entity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification90#mmIdentification
 * GenericIdentification90.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification90#mmType
 * GenericIdentification90.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification90#mmIssuer
 * GenericIdentification90.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification90#mmCountry
 * GenericIdentification90.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification90#mmShortName
 * GenericIdentification90.mmShortName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.GenericIdentification
 * GenericIdentification}</li>
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
 * "GenericIdentification90"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of an entity."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GenericIdentification90", propOrder = {"identification", "type", "issuer", "country", "shortName"})
public class GenericIdentification90 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id")
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification90
	 * GenericIdentification90}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the entity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GenericIdentification90, Optional<Max35Text>> mmIdentification = new MMMessageAttribute<GenericIdentification90, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.GenericIdentification90.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the entity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(GenericIdentification90 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(GenericIdentification90 obj, Optional<Max35Text> value) {
			obj.setIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected PartyType14Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType14Code
	 * PartyType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification90
	 * GenericIdentification90}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of identified entity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GenericIdentification90, PartyType14Code> mmType = new MMMessageAttribute<GenericIdentification90, PartyType14Code>() {
		{
			businessComponentTrace_lazy = () -> GenericIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.GenericIdentification90.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of identified entity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PartyType14Code.mmObject();
		}

		@Override
		public PartyType14Code getValue(GenericIdentification90 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(GenericIdentification90 obj, PartyType14Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Issr")
	protected PartyType4Code issuer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType4Code
	 * PartyType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole
	 * IdentificationIssuerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification90
	 * GenericIdentification90}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity assigning the identification (for example merchant, acceptor, acquirer, or tax authority)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GenericIdentification90, Optional<PartyType4Code>> mmIssuer = new MMMessageAttribute<GenericIdentification90, Optional<PartyType4Code>>() {
		{
			businessComponentTrace_lazy = () -> IdentificationIssuerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.GenericIdentification90.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Entity assigning the identification (for example merchant, acceptor, acquirer, or tax authority).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PartyType4Code.mmObject();
		}

		@Override
		public Optional<PartyType4Code> getValue(GenericIdentification90 obj) {
			return obj.getIssuer();
		}

		@Override
		public void setValue(GenericIdentification90 obj, Optional<PartyType4Code> value) {
			obj.setIssuer(value.orElse(null));
		}
	};
	@XmlElement(name = "Ctry")
	protected Min2Max3AlphaText country;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Min2Max3AlphaText
	 * Min2Max3AlphaText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification90
	 * GenericIdentification90}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ctry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of the entity (ISO 3166-1 alpha-2 or alpha-3)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GenericIdentification90, Optional<Min2Max3AlphaText>> mmCountry = new MMMessageAttribute<GenericIdentification90, Optional<Min2Max3AlphaText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.GenericIdentification90.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Country of the entity (ISO 3166-1 alpha-2 or alpha-3).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min2Max3AlphaText.mmObject();
		}

		@Override
		public Optional<Min2Max3AlphaText> getValue(GenericIdentification90 obj) {
			return obj.getCountry();
		}

		@Override
		public void setValue(GenericIdentification90 obj, Optional<Min2Max3AlphaText> value) {
			obj.setCountry(value.orElse(null));
		}
	};
	@XmlElement(name = "ShrtNm")
	protected Max35Text shortName;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationName#mmShortName
	 * OrganisationName.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification90
	 * GenericIdentification90}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the entity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GenericIdentification90, Optional<Max35Text>> mmShortName = new MMMessageAttribute<GenericIdentification90, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> OrganisationName.mmShortName;
			componentContext_lazy = () -> com.tools20022.repository.msg.GenericIdentification90.mmObject();
			isDerived = false;
			xmlTag = "ShrtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortName";
			definition = "Name of the entity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(GenericIdentification90 obj) {
			return obj.getShortName();
		}

		@Override
		public void setValue(GenericIdentification90 obj, Optional<Max35Text> value) {
			obj.setShortName(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GenericIdentification90.mmIdentification, com.tools20022.repository.msg.GenericIdentification90.mmType,
						com.tools20022.repository.msg.GenericIdentification90.mmIssuer, com.tools20022.repository.msg.GenericIdentification90.mmCountry, com.tools20022.repository.msg.GenericIdentification90.mmShortName);
				trace_lazy = () -> GenericIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GenericIdentification90";
				definition = "Identification of an entity.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getIdentification() {
		return identification == null ? Optional.empty() : Optional.of(identification);
	}

	public GenericIdentification90 setIdentification(Max35Text identification) {
		this.identification = identification;
		return this;
	}

	public PartyType14Code getType() {
		return type;
	}

	public GenericIdentification90 setType(PartyType14Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<PartyType4Code> getIssuer() {
		return issuer == null ? Optional.empty() : Optional.of(issuer);
	}

	public GenericIdentification90 setIssuer(PartyType4Code issuer) {
		this.issuer = issuer;
		return this;
	}

	public Optional<Min2Max3AlphaText> getCountry() {
		return country == null ? Optional.empty() : Optional.of(country);
	}

	public GenericIdentification90 setCountry(Min2Max3AlphaText country) {
		this.country = country;
		return this;
	}

	public Optional<Max35Text> getShortName() {
		return shortName == null ? Optional.empty() : Optional.of(shortName);
	}

	public GenericIdentification90 setShortName(Max35Text shortName) {
		this.shortName = shortName;
		return this;
	}
}