package com.commercetools.sunrise.productcatalog.common;

import com.commercetools.sunrise.common.models.ViewModel;
import com.commercetools.sunrise.common.models.ProductAttributeBean;

import java.util.List;

public class ProductDetailsBean extends ViewModel {

    private List<ProductAttributeBean> features;

    public ProductDetailsBean() {
    }

    public List<ProductAttributeBean> getFeatures() {
        return features;
    }

    public void setFeatures(final List<ProductAttributeBean> features) {
        this.features = features;
    }
}
