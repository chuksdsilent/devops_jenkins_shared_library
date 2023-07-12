dev call(Map stageParams){
    Checkout([
        $class: 'GitSCM',
        branches: [[name: stageParams.branch]],
        userRemoteConfigs: [[ url: stageparams.url]]
    ])
}