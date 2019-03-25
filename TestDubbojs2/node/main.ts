import  {demoService} from './dubboConfig'
demoService.sayHello('baby').then(({res, err}) =>{
   console.log(err, res);
});