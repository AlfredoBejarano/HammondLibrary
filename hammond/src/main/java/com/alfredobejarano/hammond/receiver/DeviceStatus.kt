package com.alfredobejarano.hammond.receiver

/**
 * Enum class that defines the different statuses that a device
 * can be in the progress of using a device.
 *
 * @author Alfredo Bejarano
 * @version 1.0
 * @since 24/08/2018 - 08:24 PM
 */
enum class DeviceStatus {
    /**
     * The device is ready to use.
     */
    STATUS_READY,
    /**
     * The device has been connected but it is unsafe to be used.
     */
    STATUS_CONNECTED,
    /**
     *The device has been disconnected.
     */
    STATUS_DISCONNECTED,
    /**
     * The device is connected but permissions for access to it need to be granted.
     */
    STATUS_PERMISSION_NEEDED,
    /**
     * The device interface can be retrieved.
     */
    STATUS_INTERFACE_FAILED,
    /**
     * The device IO endpoints cant be retrieved.
     */
    STATUS_ENDPOINTS_FAILED,
    /**
     * The device can't be opened.
     */
    STATUS_OPEN_FAILED,
    /**
     * A connection to the device has failed.
     */
    STATUS_CONNECTION_FAILED,
    /**
     * Status that defines that something went wrong while calling the device's C++ libraries.
     */
    STATUS_LOW_LEVEL_INTERFACE_ERROR,
    /**
     * Enum value that defines the fingerprint sensor is currently scanning.
     */
    STATUS_SCANNING,
    /**
     * Defines that an error happened within the sensor while scanning.
     */
    STATUS_SENSOR_ERROR
}