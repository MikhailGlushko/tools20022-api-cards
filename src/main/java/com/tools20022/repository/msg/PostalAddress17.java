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
import com.tools20022.repository.choice.GeographicLocation1Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.Country;
import com.tools20022.repository.entity.PostalAddress;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information that locates and identifies a specific address, as defined by
 * postal services or in free format text.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress17#mmAddressLine
 * PostalAddress17.mmAddressLine}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress17#mmStreetName
 * PostalAddress17.mmStreetName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PostalAddress17#mmBuildingNumber
 * PostalAddress17.mmBuildingNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress17#mmPostCode
 * PostalAddress17.mmPostCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress17#mmTownName
 * PostalAddress17.mmTownName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PostalAddress17#mmCountrySubDivision
 * PostalAddress17.mmCountrySubDivision}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress17#mmCountry
 * PostalAddress17.mmCountry}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress17#mmGeoLocation
 * PostalAddress17.mmGeoLocation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PostalAddress
 * PostalAddress}</li>
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
 * "PostalAddress17"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information that locates and identifies a specific address, as defined by postal services or in free format text."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress18
 * PostalAddress18}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PostalAddress17", propOrder = {"addressLine", "streetName", "buildingNumber", "postCode", "townName", "countrySubDivision", "country", "geoLocation"})
public class PostalAddress17 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AdrLine")
	protected List<Max70Text> addressLine;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress17
	 * PostalAddress17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdrLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that locates and identifies a specific address, as defined by postal services, that is presented in free format text."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress18#mmAddressLine
	 * PostalAddress18.mmAddressLine}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PostalAddress17, List<Max70Text>> mmAddressLine = new MMMessageAttribute<PostalAddress17, List<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress17.mmObject();
			isDerived = false;
			xmlTag = "AdrLine";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressLine";
			definition = "Information that locates and identifies a specific address, as defined by postal services, that is presented in free format text.";
			nextVersions_lazy = () -> Arrays.asList(PostalAddress18.mmAddressLine);
			maxOccurs = 2;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public List<Max70Text> getValue(PostalAddress17 obj) {
			return obj.getAddressLine();
		}

		@Override
		public void setValue(PostalAddress17 obj, List<Max70Text> value) {
			obj.setAddressLine(value);
		}
	};
	@XmlElement(name = "StrtNm")
	protected Max70Text streetName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmStreetName
	 * PostalAddress.mmStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress17
	 * PostalAddress17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrtNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StreetName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of a street or thoroughfare."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress18#mmStreetName
	 * PostalAddress18.mmStreetName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PostalAddress17, Optional<Max70Text>> mmStreetName = new MMMessageAttribute<PostalAddress17, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmStreetName;
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress17.mmObject();
			isDerived = false;
			xmlTag = "StrtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StreetName";
			definition = "Name of a street or thoroughfare.";
			nextVersions_lazy = () -> Arrays.asList(PostalAddress18.mmStreetName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(PostalAddress17 obj) {
			return obj.getStreetName();
		}

		@Override
		public void setValue(PostalAddress17 obj, Optional<Max70Text> value) {
			obj.setStreetName(value.orElse(null));
		}
	};
	@XmlElement(name = "BldgNb")
	protected Max16Text buildingNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmStreetBuildingIdentification
	 * PostalAddress.mmStreetBuildingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress17
	 * PostalAddress17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BldgNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuildingNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number that identifies the position of a building on a street."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress18#mmBuildingNumber
	 * PostalAddress18.mmBuildingNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PostalAddress17, Optional<Max16Text>> mmBuildingNumber = new MMMessageAttribute<PostalAddress17, Optional<Max16Text>>() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmStreetBuildingIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress17.mmObject();
			isDerived = false;
			xmlTag = "BldgNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuildingNumber";
			definition = "Number that identifies the position of a building on a street.";
			nextVersions_lazy = () -> Arrays.asList(PostalAddress18.mmBuildingNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		@Override
		public Optional<Max16Text> getValue(PostalAddress17 obj) {
			return obj.getBuildingNumber();
		}

		@Override
		public void setValue(PostalAddress17 obj, Optional<Max16Text> value) {
			obj.setBuildingNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "PstCd")
	protected Max16Text postCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmPostCodeIdentification
	 * PostalAddress.mmPostCodeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress17
	 * PostalAddress17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress18#mmPostCode
	 * PostalAddress18.mmPostCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PostalAddress17, Optional<Max16Text>> mmPostCode = new MMMessageAttribute<PostalAddress17, Optional<Max16Text>>() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmPostCodeIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress17.mmObject();
			isDerived = false;
			xmlTag = "PstCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostCode";
			definition = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.";
			nextVersions_lazy = () -> Arrays.asList(PostalAddress18.mmPostCode);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		@Override
		public Optional<Max16Text> getValue(PostalAddress17 obj) {
			return obj.getPostCode();
		}

		@Override
		public void setValue(PostalAddress17 obj, Optional<Max16Text> value) {
			obj.setPostCode(value.orElse(null));
		}
	};
	@XmlElement(name = "TwnNm", required = true)
	protected Max35Text townName;
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
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmTownName
	 * PostalAddress.mmTownName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress17
	 * PostalAddress17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TwnNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TownName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of a built-up area, with defined boundaries, and a local government."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress18#mmTownName
	 * PostalAddress18.mmTownName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PostalAddress17, Max35Text> mmTownName = new MMMessageAttribute<PostalAddress17, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmTownName;
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress17.mmObject();
			isDerived = false;
			xmlTag = "TwnNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TownName";
			definition = "Name of a built-up area, with defined boundaries, and a local government.";
			nextVersions_lazy = () -> Arrays.asList(PostalAddress18.mmTownName);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PostalAddress17 obj) {
			return obj.getTownName();
		}

		@Override
		public void setValue(PostalAddress17 obj, Max35Text value) {
			obj.setTownName(value);
		}
	};
	@XmlElement(name = "CtrySubDvsn")
	protected List<Max35Text> countrySubDivision;
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
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmState
	 * PostalAddress.mmState}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress17
	 * PostalAddress17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrySubDvsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountrySubDivision"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a subdivision of a country, for instance state, region, county."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress18#mmCountrySubDivision
	 * PostalAddress18.mmCountrySubDivision}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PostalAddress17, List<Max35Text>> mmCountrySubDivision = new MMMessageAttribute<PostalAddress17, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmState;
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress17.mmObject();
			isDerived = false;
			xmlTag = "CtrySubDvsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountrySubDivision";
			definition = "Identifies a subdivision of a country, for instance state, region, county.";
			nextVersions_lazy = () -> Arrays.asList(PostalAddress18.mmCountrySubDivision);
			maxOccurs = 2;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(PostalAddress17 obj) {
			return obj.getCountrySubDivision();
		}

		@Override
		public void setValue(PostalAddress17 obj, List<Max35Text> value) {
			obj.setCountrySubDivision(value);
		}
	};
	@XmlElement(name = "Ctry", required = true)
	protected CountryCode country;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCode
	 * Country.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress17
	 * PostalAddress17}</li>
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
	 * definition} =
	 * "Nation with its own government, occupying a particular territory."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress18#mmCountry
	 * PostalAddress18.mmCountry}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PostalAddress17, CountryCode> mmCountry = new MMMessageAttribute<PostalAddress17, CountryCode>() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress17.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Nation with its own government, occupying a particular territory.";
			nextVersions_lazy = () -> Arrays.asList(PostalAddress18.mmCountry);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public CountryCode getValue(PostalAddress17 obj) {
			return obj.getCountry();
		}

		@Override
		public void setValue(PostalAddress17 obj, CountryCode value) {
			obj.setCountry(value);
		}
	};
	@XmlElement(name = "GLctn")
	protected GeographicLocation1Choice geoLocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.GeographicLocation1Choice
	 * GeographicLocation1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress17
	 * PostalAddress17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GLctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeoLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Geographic location of the ATM specified by geographic coordinates or UTM coordinates."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PostalAddress17, Optional<GeographicLocation1Choice>> mmGeoLocation = new MMMessageAssociationEnd<PostalAddress17, Optional<GeographicLocation1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress17.mmObject();
			isDerived = false;
			xmlTag = "GLctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeoLocation";
			definition = "Geographic location of the ATM specified by geographic coordinates or UTM coordinates.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GeographicLocation1Choice.mmObject();
		}

		@Override
		public Optional<GeographicLocation1Choice> getValue(PostalAddress17 obj) {
			return obj.getGeoLocation();
		}

		@Override
		public void setValue(PostalAddress17 obj, Optional<GeographicLocation1Choice> value) {
			obj.setGeoLocation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress17.mmAddressLine, com.tools20022.repository.msg.PostalAddress17.mmStreetName,
						com.tools20022.repository.msg.PostalAddress17.mmBuildingNumber, com.tools20022.repository.msg.PostalAddress17.mmPostCode, com.tools20022.repository.msg.PostalAddress17.mmTownName,
						com.tools20022.repository.msg.PostalAddress17.mmCountrySubDivision, com.tools20022.repository.msg.PostalAddress17.mmCountry, com.tools20022.repository.msg.PostalAddress17.mmGeoLocation);
				trace_lazy = () -> PostalAddress.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PostalAddress17";
				definition = "Information that locates and identifies a specific address, as defined by postal services or in free format text.";
				nextVersions_lazy = () -> Arrays.asList(PostalAddress18.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<Max70Text> getAddressLine() {
		return addressLine == null ? addressLine = new ArrayList<>() : addressLine;
	}

	public PostalAddress17 setAddressLine(List<Max70Text> addressLine) {
		this.addressLine = Objects.requireNonNull(addressLine);
		return this;
	}

	public Optional<Max70Text> getStreetName() {
		return streetName == null ? Optional.empty() : Optional.of(streetName);
	}

	public PostalAddress17 setStreetName(Max70Text streetName) {
		this.streetName = streetName;
		return this;
	}

	public Optional<Max16Text> getBuildingNumber() {
		return buildingNumber == null ? Optional.empty() : Optional.of(buildingNumber);
	}

	public PostalAddress17 setBuildingNumber(Max16Text buildingNumber) {
		this.buildingNumber = buildingNumber;
		return this;
	}

	public Optional<Max16Text> getPostCode() {
		return postCode == null ? Optional.empty() : Optional.of(postCode);
	}

	public PostalAddress17 setPostCode(Max16Text postCode) {
		this.postCode = postCode;
		return this;
	}

	public Max35Text getTownName() {
		return townName;
	}

	public PostalAddress17 setTownName(Max35Text townName) {
		this.townName = Objects.requireNonNull(townName);
		return this;
	}

	public List<Max35Text> getCountrySubDivision() {
		return countrySubDivision == null ? countrySubDivision = new ArrayList<>() : countrySubDivision;
	}

	public PostalAddress17 setCountrySubDivision(List<Max35Text> countrySubDivision) {
		this.countrySubDivision = Objects.requireNonNull(countrySubDivision);
		return this;
	}

	public CountryCode getCountry() {
		return country;
	}

	public PostalAddress17 setCountry(CountryCode country) {
		this.country = Objects.requireNonNull(country);
		return this;
	}

	public Optional<GeographicLocation1Choice> getGeoLocation() {
		return geoLocation == null ? Optional.empty() : Optional.of(geoLocation);
	}

	public PostalAddress17 setGeoLocation(GeographicLocation1Choice geoLocation) {
		this.geoLocation = geoLocation;
		return this;
	}
}