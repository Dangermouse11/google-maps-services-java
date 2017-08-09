/*
 * Copyright 2014 Google Inc. All rights reserved.
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF
 * ANY KIND, either express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.google.maps.model;

import com.google.maps.internal.StringJoin.UrlValue;

/**
 * The Address types. Please see <a
 * href="https://developers.google.com/maps/documentation/geocoding/intro#Types">Address Types and
 * Address Component Types</a> for more detail. Some addresses contain additional place categories.
 * Please see <a href="https://developers.google.com/places/supported_types">Place Types</a> for
 * more detail.
 */
public enum AddressType implements UrlValue {

  /** A precise street address. */
  STREET_ADDRESS("street_address"),

  /** A named route (such as "US 101"). */
  ROUTE("route"),

  /** A major intersection, usually of two major roads. */
  INTERSECTION("intersection"),

  /** A political entity. Usually, this type indicates a polygon of some civil administration. */
  POLITICAL("political"),

  /** The national political entity, typically the highest order type returned by the Geocoder. */
  COUNTRY("country"),

  /**
   * A first-order civil entity below the country level. Within the United States, these
   * administrative levels are states. Not all nations exhibit these administrative levels.
   */
  ADMINISTRATIVE_AREA_LEVEL_1("administrative_area_level_1"),

  /**
   * A second-order civil entity below the country level. Within the United States, these
   * administrative levels are counties. Not all nations exhibit these administrative levels.
   */
  ADMINISTRATIVE_AREA_LEVEL_2("administrative_area_level_2"),

  /**
   * A third-order civil entity below the country level. This type indicates a minor civil division.
   * Not all nations exhibit these administrative levels.
   */
  ADMINISTRATIVE_AREA_LEVEL_3("administrative_area_level_3"),

  /**
   * A fourth-order civil entity below the country level. This type indicates a minor civil
   * division. Not all nations exhibit these administrative levels.
   */
  ADMINISTRATIVE_AREA_LEVEL_4("administrative_area_level_4"),

  /**
   * A fifth-order civil entity below the country level. This type indicates a minor civil division.
   * Not all nations exhibit these administrative levels.
   */
  ADMINISTRATIVE_AREA_LEVEL_5("administrative_area_level_5"),

  /** A commonly-used alternative name for the entity. */
  COLLOQUIAL_AREA("colloquial_area"),

  /** An incorporated city or town political entity. */
  LOCALITY("locality"),

  /**
   * A specific type of Japanese locality, used to facilitate distinction between multiple locality
   * components within a Japanese address.
   */
  WARD("ward"),

  /**
   * A first-order civil entity below a locality. Some locations may receive one of the additional
   * types: {@code SUBLOCALITY_LEVEL_1} to {@code SUBLOCALITY_LEVEL_5}. Each sublocality level is a
   * civil entity. Larger numbers indicate a smaller geographic area.
   */
  SUBLOCALITY("sublocality"),
  SUBLOCALITY_LEVEL_1("sublocality_level_1"),
  SUBLOCALITY_LEVEL_2("sublocality_level_2"),
  SUBLOCALITY_LEVEL_3("sublocality_level_3"),
  SUBLOCALITY_LEVEL_4("sublocality_level_4"),
  SUBLOCALITY_LEVEL_5("sublocality_level_5"),

  /** A named neighborhood. */
  NEIGHBORHOOD("neighborhood"),

  /** A named location, usually a building or collection of buildings with a common name. */
  PREMISE("premise"),

  /**
   * A first-order entity below a named location, usually a singular building within a collection of
   * buildings with a common name.
   */
  SUBPREMISE("subpremise"),

  /** A postal code as used to address postal mail within the country. */
  POSTAL_CODE("postal_code"),

  /** A postal code prefix as used to address postal mail within the country. */
  POSTAL_CODE_PREFIX("postal_code_prefix"),

  /** A prominent natural feature. */
  NATURAL_FEATURE("natural_feature"),

  /** An airport. */
  AIRPORT("airport"),

  /** A university. */
  UNIVERSITY("university"),

  /** A named park. */
  PARK("park"),

  /**
   * A named point of interest. Typically, these "POI"s are prominent local entities that don't
   * easily fit in another category, such as "Empire State Building" or "Statue of Liberty."
   */
  POINT_OF_INTEREST("point_of_interest"),

  /** A place that has not yet been categorized. */
  ESTABLISHMENT("establishment"),

  /** The location of a bus stop. */
  BUS_STATION("bus_station"),

  /** The location of a train station. */
  TRAIN_STATION("train_station"),

  /** The location of a subway station. */
  SUBWAY_STATION("subway_station"),

  /** The location of a transit station. */
  TRANSIT_STATION("transit_station"),

  /** The location of a light rail station. */
  LIGHT_RAIL_STATION("light_rail_station"),

  /** The location of a church. */
  CHURCH("church"),

  /** The location of a finance institute. */
  FINANCE("finance"),

  /** The location of a post office. */
  POST_OFFICE("post_office"),

  /** The location of a place of worship. */
  PLACE_OF_WORSHIP("place_of_worship"),

  /**
   * A grouping of geographic areas, such as locality and sublocality, used for mailing addresses in
   * some countries.
   */
  POSTAL_TOWN("postal_town"),

  /** Currently not a documented return type. */
  SYNAGOGUE("synagogue"),

  /** Currently not a documented return type. */
  FOOD("food"),

  /** Currently not a documented return type. */
  GROCERY_OR_SUPERMARKET("grocery_or_supermarket"),

  /** Currently not a documented return type. */
  STORE("store"),

  /** Currently not a documented return type. */
  LAWYER("lawyer"),

  /** Currently not a documented return type. */
  HEALTH("health"),

  /** Currently not a documented return type. */
  INSURANCE_AGENCY("insurance_agency"),

  /** Currently not a documented return type. */
  GAS_STATION("gas_station"),

  /** Currently not a documented return type. */
  CAR_DEALER("car_dealer"),

  /** Currently not a documented return type. */
  CAR_REPAIR("car_repair"),

  /** Currently not a documented return type. */
  MEAL_TAKEAWAY("meal_takeaway"),

  /** Currently not a documented return type. */
  FURNITURE_STORE("furniture_store"),

  /** Currently not a documented return type. */
  HOME_GOODS_STORE("home_goods_store"),

  /** Currently not a documented return type. */
  SHOPPING_MALL("shopping_mall"),

  /** Currently not a documented return type. */
  GYM("gym"),

  /** Currently not a documented return type. */
  ACCOUNTING("accounting"),

  /** Currently not a documented return type. */
  MOVING_COMPANY("moving_company"),

  /** Currently not a documented return type. */
  LODGING("lodging"),

  /** Currently not a documented return type. */
  STORAGE("storage"),

  /**
   * Indicates an unknown address type returned by the server. The Java Client for Google Maps
   * Services should be updated to support the new value.
   */
  UNKNOWN("unknown");

  private final String addressType;

  AddressType(final String addressType) {
    this.addressType = addressType;
  }

  @Override
  public String toString() {
    return addressType;
  }

  public String toCanonicalLiteral() {
    return toString();
  }

  @Override
  public String toUrlValue() {
    if (this == UNKNOWN) {
      throw new UnsupportedOperationException("Shouldn't use AddressType.UNKNOWN in a request.");
    }
    return addressType;
  }
}
