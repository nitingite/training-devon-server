package io.oasp.gastronomy.restaurant.offermanagement.common.api;

import java.util.Date;

import io.oasp.gastronomy.restaurant.general.common.api.ApplicationEntity;
import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;

public interface Special extends ApplicationEntity {

  public String getName();

  public void setName(String name);

  public Long getOfferId();

  public void setOfferId(Long offerId);

  public WeeklyPeriod getActivePeriod();

  public void setActivePeriod(WeeklyPeriod activePeriod);

  public Money getSpecialPrice();

  public void setSpecialPrice(Money specialPrice);

  public Date getCreatedDate();

  public void setCreatedDate(Date createdDate);

  public String getComment();

  public void setComment(String comment);

}
