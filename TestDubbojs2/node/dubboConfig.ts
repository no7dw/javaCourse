import {Dubbo , java TDubboCallResult} from 'dubbo2.js'

const dubbo = new Dubbo({
    application: {name: 'demo'},
    register: 'localhost:2181',
    dubboVersion: '2.0.0',
    interfaces: ['com.alibaba.dubbo.demo.DemoProvider'],
});

interface  IDemoService {
    sayHello(name: string): TDubboCallResult<string>;
}

export const demoService = dubbo.proxyService<IDemoService>({
    dubboInterface: 'com.alibaba.dubbo.demo.DemoProvider',
    version: '1.0.0',
    methods: {
        sayHello(name: string) {
            return [java.String(name)];
        },
        echo() {},
        test() {},
    }
});