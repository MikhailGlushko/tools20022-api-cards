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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.catm.StatusReportV07;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification71;
import com.tools20022.repository.msg.TerminalManagementDataSet26;
import com.tools20022.repository.msg.TriggerInformation1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Status of the acceptor system containing the identification of the POI (Point
 * Of Interaction), its components and their installed versions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReport7#mmPOIIdentification
 * StatusReport7.mmPOIIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReport7#mmInitiatingTrigger
 * StatusReport7.mmInitiatingTrigger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReport7#mmTerminalManagerIdentification
 * StatusReport7.mmTerminalManagerIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusReport7#mmDataSet
 * StatusReport7.mmDataSet}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.StatusReportV07#mmStatusReport
 * StatusReportV07.mmStatusReport}</li>
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
 * "StatusReport7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status of the acceptor system containing the identification of the POI (Point Of Interaction), its components and their installed versions."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatusReport7", propOrder = {"pOIIdentification", "initiatingTrigger", "terminalManagerIdentification", "dataSet"})
public class StatusReport7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "POIId", required = true)
	protected GenericIdentification71 pOIIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification71
	 * GenericIdentification71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReport7 StatusReport7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POIId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the point of interaction for terminal management."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatusReport7, GenericIdentification71> mmPOIIdentification = new MMMessageAssociationEnd<StatusReport7, GenericIdentification71>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusReport7.mmObject();
			isDerived = false;
			xmlTag = "POIId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIIdentification";
			definition = "Identification of the point of interaction for terminal management.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification71.mmObject();
		}

		@Override
		public GenericIdentification71 getValue(StatusReport7 obj) {
			return obj.getPOIIdentification();
		}

		@Override
		public void setValue(StatusReport7 obj, GenericIdentification71 value) {
			obj.setPOIIdentification(value);
		}
	};
	@XmlElement(name = "InitgTrggr")
	protected TriggerInformation1 initiatingTrigger;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TriggerInformation1
	 * TriggerInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReport7 StatusReport7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitgTrggr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatingTrigger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the requestor."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatusReport7, Optional<TriggerInformation1>> mmInitiatingTrigger = new MMMessageAssociationEnd<StatusReport7, Optional<TriggerInformation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusReport7.mmObject();
			isDerived = false;
			xmlTag = "InitgTrggr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatingTrigger";
			definition = "Identification of the requestor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TriggerInformation1.mmObject();
		}

		@Override
		public Optional<TriggerInformation1> getValue(StatusReport7 obj) {
			return obj.getInitiatingTrigger();
		}

		@Override
		public void setValue(StatusReport7 obj, Optional<TriggerInformation1> value) {
			obj.setInitiatingTrigger(value.orElse(null));
		}
	};
	@XmlElement(name = "TermnlMgrId", required = true)
	protected GenericIdentification71 terminalManagerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification71
	 * GenericIdentification71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReport7 StatusReport7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermnlMgrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalManagerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the terminal management system (TMS) to contact for the maintenance."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatusReport7, GenericIdentification71> mmTerminalManagerIdentification = new MMMessageAssociationEnd<StatusReport7, GenericIdentification71>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusReport7.mmObject();
			isDerived = false;
			xmlTag = "TermnlMgrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalManagerIdentification";
			definition = "Identification of the terminal management system (TMS) to contact for the maintenance.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification71.mmObject();
		}

		@Override
		public GenericIdentification71 getValue(StatusReport7 obj) {
			return obj.getTerminalManagerIdentification();
		}

		@Override
		public void setValue(StatusReport7 obj, GenericIdentification71 value) {
			obj.setTerminalManagerIdentification(value);
		}
	};
	@XmlElement(name = "DataSet", required = true)
	protected TerminalManagementDataSet26 dataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet26
	 * TerminalManagementDataSet26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReport7 StatusReport7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data related to a status report of a point of interaction (POI)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatusReport7, TerminalManagementDataSet26> mmDataSet = new MMMessageAssociationEnd<StatusReport7, TerminalManagementDataSet26>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusReport7.mmObject();
			isDerived = false;
			xmlTag = "DataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSet";
			definition = "Data related to a status report of a point of interaction (POI).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TerminalManagementDataSet26.mmObject();
		}

		@Override
		public TerminalManagementDataSet26 getValue(StatusReport7 obj) {
			return obj.getDataSet();
		}

		@Override
		public void setValue(StatusReport7 obj, TerminalManagementDataSet26 value) {
			obj.setDataSet(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatusReport7.mmPOIIdentification, com.tools20022.repository.msg.StatusReport7.mmInitiatingTrigger,
						com.tools20022.repository.msg.StatusReport7.mmTerminalManagerIdentification, com.tools20022.repository.msg.StatusReport7.mmDataSet);
				messageBuildingBlock_lazy = () -> Arrays.asList(StatusReportV07.mmStatusReport);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusReport7";
				definition = "Status of the acceptor system containing the identification of the POI (Point Of Interaction), its components and their installed versions.";
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification71 getPOIIdentification() {
		return pOIIdentification;
	}

	public StatusReport7 setPOIIdentification(GenericIdentification71 pOIIdentification) {
		this.pOIIdentification = Objects.requireNonNull(pOIIdentification);
		return this;
	}

	public Optional<TriggerInformation1> getInitiatingTrigger() {
		return initiatingTrigger == null ? Optional.empty() : Optional.of(initiatingTrigger);
	}

	public StatusReport7 setInitiatingTrigger(TriggerInformation1 initiatingTrigger) {
		this.initiatingTrigger = initiatingTrigger;
		return this;
	}

	public GenericIdentification71 getTerminalManagerIdentification() {
		return terminalManagerIdentification;
	}

	public StatusReport7 setTerminalManagerIdentification(GenericIdentification71 terminalManagerIdentification) {
		this.terminalManagerIdentification = Objects.requireNonNull(terminalManagerIdentification);
		return this;
	}

	public TerminalManagementDataSet26 getDataSet() {
		return dataSet;
	}

	public StatusReport7 setDataSet(TerminalManagementDataSet26 dataSet) {
		this.dataSet = Objects.requireNonNull(dataSet);
		return this;
	}
}