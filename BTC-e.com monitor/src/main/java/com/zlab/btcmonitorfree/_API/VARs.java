package com.zlab.btcmonitorfree._API;

public class VARs {

        public static String RIGHTS_INFO="info";
        public static String RIGHTS_TRADE="trade";

        public static String[] pairs_UI = {
                "BTC / USD",
                "BTC / RUR",
                "BTC / EUR",
                "LTC / BTC",
                "LTC / USD",
                "LTC / RUR",
                "LTC / EUR",
                "NMC / BTC",
                "NMC / USD",
                "NVC / BTC",
                "NVC / USD",
                "USD / RUR",
                "EUR / USD",
                "EUR / RUR",
                "PPC / BTC",
                "PPC / USD"
        };

        public static String[] pairs_CODE = {
                "btc_usd",
                "btc_rur",
                "btc_eur",
                "ltc_btc",
                "ltc_usd",
                "ltc_rur",
                "ltc_eur",
                "nmc_btc",
                "nmc_usd",
                "nvc_btc",
                "nvc_usd",
                "usd_rur",
                "eur_usd",
                "eur_rur",
                "ppc_btc",
                "ppc_usd"
        };

        public static String[] funds_code = {
                "USD",
                "BTC",
                "LTC",
                "EUR",
                "RUR",
                "GBP",
                "CNH",
                "NMC",
                "TRC",
                "PPC",
                "FTC",
                "XPM",
                "NVC"};

        /*
        public static String[] pairs_code = {
                "btc_usd",
                "btc_rur",
                "btc_eur",
                "ltc_btc",
                "ltc_usd",
                "ltc_rur",
                "nmc_btc",
                "nmc_usd",
                "usd_rur",
                "eur_usd"};

        public static String[] pairs_UI = {
                "BTC / USD",
                "BTC / RUR",
                "BTC / EUR",
                "LTC / BTC",
                "LTC / USD",
                "LTC / RUR",
                "NMC / BTC",
                "NMC / USD",
                "USD / RUR",
                "EUR / USD"};

        public static String[] funds_code = {
                "USD",
                "BTC",
                "LTC",
                "RUR",
                "NMC",
                "TRC",
                "PPC",
                "FTC",
                "XPM"};
                       */
        public static String response_body_getInfo;
        public static String response_body_TransHistory;
        public static String response_body_TradeHistory;
        public static String response_body_ActiveOrders;
        public static String response_body_Trade;
        public static String response_body_CancelOrder;

}
