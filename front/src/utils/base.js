const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot654g2/",
            name: "springboot654g2",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot654g2/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "社区养老服务系统"
        } 
    }
}
export default base
