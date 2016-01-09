/******************************************************************
*
* Round for Java
*
* Copyright (C) Satoshi Konno 2015
*
* This is licensed under BSD-style license, see file COPYING.
*
******************************************************************/

package org.cybergarage.round;

public class Const
{
	public static double SYSTEM_TRIGGER_TIMER_PRECISION = 0.1;
	public static String ENDL = "\n";
	public static int MD5_DIGEST_LENGTH = 16;
	public static int MD5_DIGEST_STRING_LENGTH = 32;
	public static int SHA_DIGEST_LENGTH = 20;
	public static int SHA_DIGEST_STRING_LENGTH = 40;
	public static int SHA256_DIGEST_LENGTH = 32;
	public static int SHA256_DIGEST_STRING_LENGTH = 64;
	public static int NODE_DIGEST_LENGTH = 64;
	public static String UPNP_DEVICE_TYPE = "urn:cybergarage-org:device:round:1";
	public static String UPNP_SERVICE_TYPE = "urn:cybergarage-org:service:round:1";
	public static String UPNP_ACTION_GETPRODUCTINFO = "GetProductInfo";
	public static String UPNP_ACTION_GETCONNECTIONINFO = "GetConnectionInfo";
	public static String RPC_HTTP_ENDPOINT = "/rpc";
	public static String RPC_HTTP_CONTENT_TYPE = "application/json-rpc";
	public static int RPC_HTTP_STATUS_CODE_OK = 200;
	public static int RPC_HTTP_STATUS_CODE_MOVED_PERMANENTLY = 301;
	public static int RPC_HTTP_STATUS_CODE_BAD_REQUEST = 400;
	public static int RPC_HTTP_STATUS_CODE_NOT_FOUND = 404;
	public static int RPC_HTTP_STATUS_CODE_NOT_ACCEPTABLE = 406;
	public static int RPC_HTTP_STATUS_CODE_INTERNAL_SERVER_ERROR = 500;
	public static int NODE_STATUS_UNKNOWN = 0;
	public static int NODE_STATUS_STOP = 1;
	public static int NODE_STATUS_ACTIVATING = 2;
	public static int NODE_STATUS_ACTIVE = 3;
	public static int NODE_STATUS_TERMINATING = 4;
	public static int NODE_STATUS_PROMICE = 5;
	public static String JSON_RPC_JSONRPC = "jsonrpc";
	public static String JSON_RPC_METHOD = "method";
	public static String JSON_RPC_PARAMS = "params";
	public static String JSON_RPC_ID = "id";
	public static String JSON_RPC_DEST = "dest";
	public static String JSON_RPC_TS = "ts";
	public static String JSON_RPC_RESULT = "result";
	public static String JSON_RPC_ERROR = "error";
	public static String JSON_RPC_CODE = "code";
	public static String JSON_RPC_MESSAGE = "message";
	public static String JSON_RPC_VERSION = "2.0";
	public static int JSON_RPC_REQUEST_TIMEOUT_SEC = 60;
	public static String SYSTEM_METHOD_POST_JOB = "post_job";
	public static String SYSTEM_METHOD_SET_METHOD = "set_method";
	public static String SYSTEM_METHOD_SET_ALIAS = "set_alias";
	public static String SYSTEM_METHOD_SET_ROUTE = "set_route";
	public static String SYSTEM_METHOD_SET_TIMER = "set_timer";
	public static String SYSTEM_METHOD_ADD_NODE = "add_node";
	public static String SYSTEM_METHOD_REMOVE_METHOD = "remove_method";
	public static String SYSTEM_METHOD_REMOVE_ALIAS = "remove_alias";
	public static String SYSTEM_METHOD_REMOVE_ROUTE = "remove_route";
	public static String SYSTEM_METHOD_REMOVE_TIMER = "remove_timer";
	public static String SYSTEM_METHOD_REMOVE_NODE = "remove_node";
	public static String SYSTEM_METHOD_ECHO = "_echo";
	public static String SYSTEM_METHOD_GET_NETWORK_STATE = "get_network_state";
	public static String SYSTEM_METHOD_GET_CLUSTER_STATE = "get_cluster_state";
	public static String SYSTEM_METHOD_SET_REGISTRY = "set_registry";
	public static String SYSTEM_METHOD_GET_REGISTRY = "get_registry";
	public static String SYSTEM_METHOD_REMOVE_REGISTRY = "remove_registry";
	public static String SYSTEM_METHOD_GET_NODE_STATE = "get_node_state";
	public static String SYSTEM_METHOD_GET_NODE_CONFIG = "get_node_config";
	public static String SYSTEM_METHOD_PARAM_NAME = "name";
	public static String SYSTEM_METHOD_PARAM_LANGUAGE = "lang";
	public static String SYSTEM_METHOD_PARAM_CODE = "code";
	public static String SYSTEM_METHOD_PARAM_ENCODE = "enc";
	public static String SYSTEM_METHOD_PARAM_BASE64 = "base64";
	public static String SYSTEM_METHOD_PARAM_KEY = "key";
	public static String SYSTEM_METHOD_PARAM_VALUE = "val";
	public static String SYSTEM_METHOD_PARAM_TS = "ts";
	public static String SYSTEM_METHOD_PARAM_LTS = "lts";
	public static String SYSTEM_METHOD_PARAM_SRC = "src";
	public static String SYSTEM_METHOD_PARAM_DEST = "dest";
	public static String SYSTEM_METHOD_PARAM_TYPE = "type";
	public static String SYSTEM_METHOD_PARAM_COND = "cond";
	public static String SYSTEM_METHOD_PARAM_ADDR = "addr";
	public static String SYSTEM_METHOD_PARAM_PORT = "port";
	public static String SYSTEM_METHOD_PARAM_HASH = "hash";
	public static String SYSTEM_METHOD_PARAM_VERSION = "version";
	public static String SYSTEM_METHOD_PARAM_NODES = "nodes";
	public static String SYSTEM_METHOD_PARAM_CLUSTER = "cluster";
	public static String SYSTEM_METHOD_PARAM_CLUSTERS = "clusters";
	public static String SYSTEM_METHOD_PARAM_STATE = "state";
	public static String SYSTEM_METHOD_PARAM_METHOD = "method";
	public static String SYSTEM_METHOD_PARAM_DEFAULTS = "defaults";
	public static String SYSTEM_METHOD_PARAM_START_TIME = "start_time";
	public static String SYSTEM_METHOD_PARAM_STOP_TIME = "stop_time";
	public static String SYSTEM_METHOD_PARAM_DURATION = "duration";
	public static String SYSTEM_METHOD_PARAM_LOOP = "loop";
	public static String SYSTEM_METHOD_ADD_NODE_CMD = "/usr/local/bin/roundd";
	public static int SYSTEM_METHOD_REMOVE_NODE_DELAY_MSEC = 5000;
	public static String SYSTEM_METHOD_DEST_ALL_NODE = "*";
	public static String SYSTEM_METHOD_DEST_ANY_NODE = "?";
	public static String SYSTEM_METHOD_DEST_LOCAL_NODE = ".";
	public static String SCRIPT_LANGUAGE_JS = "js";
	public static String SCRIPT_LANGUAGE_RUBY = "ruby";
	public static String SCRIPT_LANGUAGE_LUA = "lua";
	public static String SCRIPT_LANGUAGE_PYTHON = "python";
	public static String SCRIPT_LANGUAGE_JAVA = "java";
	public static String SCRIPT_POST_METHOD = "post_method";
	public static String SCRIPT_PRINT_METHOD = "print";
	public static String SCRIPT_SEARCH_METHOD = "search";
	public static int SCRIPT_SEARCH_METHOD_WAIT_MSEC = 5000;

	public static String NODE_CLUSTER_NAME = "round";
}
