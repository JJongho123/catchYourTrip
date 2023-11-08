const path = require('path');
const CopyWebpackPlugin = require('copy-webpack-plugin');

module.exports = {
    transpileDependencies: true,

    configureWebpack: {
        // 원하지 않는 코드 분할 설정을 변경
        optimization: {
            splitChunks: false,
        },

        entry: {
            'test': './src/js/test.js',
            'test2': './src/js/test2.js'
        },
    },

    // 파일 이름 설정
    filenameHashing: false,

    // 원하는 파일 이름으로 출력 디렉토리 설정
    outputDir: 'dist',

    // 파일 이름 설정
    assetsDir: '',

    chainWebpack: (config) => {


        config.plugin('copy-webpack-plugin').use(CopyWebpackPlugin, [
            {
                patterns: [
                    {
                        from: 'dist',
                        to: path.resolve( '../src/main/resources/static/webpackJs'),
                        noErrorOnMissing: true,
                    },
                ],
            },
        ]);
    },
};