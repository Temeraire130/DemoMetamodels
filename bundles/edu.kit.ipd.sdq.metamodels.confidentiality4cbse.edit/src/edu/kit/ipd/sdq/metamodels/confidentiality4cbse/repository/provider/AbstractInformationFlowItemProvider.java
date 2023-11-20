/**
 */
package edu.kit.ipd.sdq.metamodels.confidentiality4cbse.repository.provider;


import edu.kit.ipd.sdq.metamodels.confidentiality4cbse.information.InformationFactory;

import edu.kit.ipd.sdq.metamodels.confidentiality4cbse.provider.Confidentiality4cbseEditPlugin;

import edu.kit.ipd.sdq.metamodels.confidentiality4cbse.repository.AbstractInformationFlow;
import edu.kit.ipd.sdq.metamodels.confidentiality4cbse.repository.RepositoryPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.pcm.core.entity.provider.EntityItemProvider;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.metamodels.confidentiality4cbse.repository.AbstractInformationFlow} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractInformationFlowItemProvider extends EntityItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInformationFlowItemProvider(AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
	{
		if (itemPropertyDescriptors == null)
		{
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null)
		{
			super.getChildrenFeatures(object);
			childrenFeatures.add(RepositoryPackage.Literals.ABSTRACT_INFORMATION_FLOW__INFORMATION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child)
	{
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		String label = ((AbstractInformationFlow)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_AbstractInformationFlow_type") :
			getString("_UI_AbstractInformationFlow_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);

		switch (notification.getFeatureID(AbstractInformationFlow.class))
		{
			case RepositoryPackage.ABSTRACT_INFORMATION_FLOW__INFORMATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(RepositoryPackage.Literals.ABSTRACT_INFORMATION_FLOW__INFORMATION,
				 InformationFactory.eINSTANCE.createParameterInformation()));

		newChildDescriptors.add
			(createChildParameter
				(RepositoryPackage.Literals.ABSTRACT_INFORMATION_FLOW__INFORMATION,
				 InformationFactory.eINSTANCE.createSizeOfInformation()));

		newChildDescriptors.add
			(createChildParameter
				(RepositoryPackage.Literals.ABSTRACT_INFORMATION_FLOW__INFORMATION,
				 InformationFactory.eINSTANCE.createReturnValueInformation()));

		newChildDescriptors.add
			(createChildParameter
				(RepositoryPackage.Literals.ABSTRACT_INFORMATION_FLOW__INFORMATION,
				 InformationFactory.eINSTANCE.createCallInformation()));

		newChildDescriptors.add
			(createChildParameter
				(RepositoryPackage.Literals.ABSTRACT_INFORMATION_FLOW__INFORMATION,
				 InformationFactory.eINSTANCE.createAllInformation()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		return Confidentiality4cbseEditPlugin.INSTANCE;
	}

}
